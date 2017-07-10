package com.newx.common;

/**
 * Created by home on 2017/7/6.
 */
public class Const {
    public static final String CURRENT_SUER = "currentUser";

    public interface Role {
        int ROLE_STUDENT = 0; //学员
        int ROLE_TEACHER = 1; //老师
        int ROLE_ADMIN = 2; //管理员
        int ROLE_SUPERADMIN = 3; //超级管理员
    }

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
}
