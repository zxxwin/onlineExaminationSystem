package com.newx.service;

import com.newx.common.ServerResponse;
import com.newx.pojo.User;

/**
 * Created by home on 2017/7/6.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
    ServerResponse<String> register(User user);
    ServerResponse<String> checkValid(String str, String type);
    ServerResponse<User> updateUserInfo(User user);
    ServerResponse<User> getInformation(Integer userId);
}
