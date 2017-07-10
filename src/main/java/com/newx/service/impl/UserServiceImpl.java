package com.newx.service.impl;

import com.newx.common.Const;
import com.newx.common.ServerResponse;
import com.newx.dao.UserMapper;
import com.newx.pojo.User;
import com.newx.service.IUserService;
import com.newx.util.MD5Util;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by home on 2017/7/6.
 */
@Service("iUserService")
//@Service("UserService") 注解用于标示此类为业务层组件,在使用时会被注解的类会自动由spring进行注入,无需我们创建实例
public class UserServiceImpl implements IUserService {


    @Autowired  //自动注入UserMapper 用于访问数据库
    private UserMapper userMapper;

    @Override
    public ServerResponse<User> login(String username, String psd) {
        System.out.println("username = "+username);
        int resultCount = userMapper.checkUsername(username);
        if(resultCount == 0) {
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        //md5 加密
        String md5Password = MD5Util.MD5EncodeUtf8(psd);

        User user = userMapper.selectLogin(username,md5Password);
        if(user == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }

        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", user);
    }

    public ServerResponse<String> register(User user) {
        System.out.println(user.getEmail());
        user.setAvartor("/images/avartor/default.png");
        user.setGender(0);
        user.setStatus(0);
        ServerResponse validResponse = this.checkValid(user.getNickName(),Const.USERNAME);
        if (!validResponse.isSuccess()) {
            System.out.println("username");
            return validResponse;
        }

        System.out.println(user.getEmail()+' '+this.checkValid(user.getEmail(),Const.EMAIL));
        validResponse = this.checkValid(user.getEmail(),Const.EMAIL);
        if (!validResponse.isSuccess()) {
            System.out.println("EMAIL");
            return validResponse;
        }

        user.setRole(Const.Role.ROLE_STUDENT);
        //MD5 加密
        user.setPassword(MD5Util.MD5EncodeUtf8(user.getPassword()));

        int resultCount = userMapper.insert(user);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createBySuccessMessage("注册成功");
    }

    public ServerResponse<String> checkValid(String str, String type) {
        if (org.apache.commons.lang3.StringUtils.isNoneBlank(str)){
            //开始校验
            if (Const.USERNAME.equals(type)) {
                int resultCount = userMapper.checkUsername(str);
                if(resultCount > 0) {
                    return ServerResponse.createByErrorMessage("用户名已存在");
                }
            }

            if (Const.EMAIL.equals(type)) {
                int resultCount = userMapper.checkEmail(str);
                if(resultCount > 0) {
                    return ServerResponse.createByErrorMessage("邮箱已存在");
                }
            }
        }else {
            return ServerResponse.createByErrorMessage("参数错误");
        }

        return ServerResponse.createBySuccessMessage("校验成功");
    }


    public ServerResponse<User> updateUserInfo(User user) {
        System.out.print(user.getEmail());
        int result = userMapper.checkEmailByuserId(user.getUserId(), user.getEmail());
        if (result > 0){
            return ServerResponse.createByErrorMessage("邮箱已存在");
        }
        User updateUser = new User();
        updateUser.setUserId(user.getUserId());
        updateUser.setNickName(user.getNickName());
        updateUser.setEmail(user.getEmail());
        updateUser.setAddress(user.getAddress());
        updateUser.setGender(user.getGender());
        updateUser.setMainJob(user.getMainJob());
        updateUser.setUserInfo(user.getUserInfo());

        int updateCount = userMapper.updateByPrimaryKeySelective(updateUser);
        if (updateCount > 0) {
            return ServerResponse.createBySuccess("更新个人信息成功", updateUser);
        }
        return ServerResponse.createByErrorMessage("更新个人资料失败");
    }

    public ServerResponse<User> getInformation(Integer userId){
        User user = userMapper.selectByPrimaryKey(userId);
        if(user == null){
            return ServerResponse.createByErrorMessage("找不到当前用户");
        }
        user.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return ServerResponse.createBySuccess(user);
    }
}
