package com.newx.controller.portal;

import com.newx.common.Const;
import com.newx.common.ResponseCode;
import com.newx.common.ServerResponse;
import com.newx.pojo.User;
import com.newx.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by home on 2017/7/6.
 */
@Controller //@Controller注解用于标示本类为web层控制组件
@RequestMapping("/user/")//@RequestMapping("/user")用于标定访问时对url位置
public class userController {

    @Autowired //自动注入业务层的IUserService类
    private IUserService iUserService;

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> login(String username, String password, HttpSession session) {
        ServerResponse<User> response = iUserService.login(username, password);
        if(response.isSuccess()){
            session.setAttribute(Const.CURRENT_SUER, response.getData());
        }
        return response;
    }

    @RequestMapping(value = "logout.do", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session) {
        session.removeAttribute(Const.CURRENT_SUER);
        return ServerResponse.createBySuccess();
    }

    @RequestMapping(value = "register.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<String> register(User user) {
        return iUserService.register(user);
    }

    @RequestMapping(value = "checkValid.do", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> checkValid(String str, String type) {
        return iUserService.checkValid(str, type);
    }

    @RequestMapping(value = "updateUserInfo.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<User> updateUserInfo(HttpSession session, User user) {
        User currentUser = (User) session.getAttribute(Const.CURRENT_SUER);
        if (currentUser == null ){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        user.setUserId(currentUser.getUserId());
        user.setNickName(currentUser.getNickName());
        ServerResponse<User> response = iUserService.updateUserInfo(user);
        if (response.isSuccess()) {
            response.getData().setNickName(currentUser.getNickName());
            session.setAttribute(Const.CURRENT_SUER, response.getData());
        }
        return response;
    }

    @RequestMapping(value = "getInformation.do", method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<User> getInformation(HttpSession session) {
        User currentUser = (User)session.getAttribute(Const.CURRENT_SUER);
        if (currentUser == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),  "未登录");
        }
        return iUserService.getInformation(currentUser.getUserId());
    }

}
