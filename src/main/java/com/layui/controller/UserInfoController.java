package com.layui.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.layui.model.User;
import com.layui.model.base.Result;

/**
 * @author chengchenrui
 * @version Id: UserInfoController.java, v 0.1 2017.12.13 11:14 chengchenrui Exp $$
 */
@Controller
@RequestMapping(value = "/layui")
public class UserInfoController {

    @RequestMapping(value = "/list/user", method = RequestMethod.POST)
    public Result<List<User>> list(HttpServletRequest httpServletRequest) {
        List<User> users = new ArrayList<>();
        User user;
        for (int i = 0; i < 20; i++) {
            user = new User();
            user.setUserName("用户名——" + i);
            user.setUserEmail(i + "");
            user.setUserSex("男");
            user.setUserGrade("123");
            user.setUserStatus("1");
            user.setUserEndTime(i * 5 + "");
            users.add(user);
        }
        return new Result<>(true, users);
    }

}
