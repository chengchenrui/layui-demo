package com.layui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping(value = "/list/user", method = RequestMethod.POST, produces = { "application/json;charset=utf-8" })
    public Result<List<User>> list(Model model) {
        List<User> users = new ArrayList<>();
        User user;
        for (int i = 0; i < 20; i++) {
            user = new User();
            user.setId(i + "");
            user.setUsername("用户名——" + i);
            user.setSex("男");
            user.setCity("A");
            user.setSign("123");
            user.setExperience("100");
            user.setScore(i * 5 + "");
            user.setClassify("开发");
            user.setWealth(i * 10 + "");
            users.add(user);
        }
        return new Result<>(true, users);
    }

}
