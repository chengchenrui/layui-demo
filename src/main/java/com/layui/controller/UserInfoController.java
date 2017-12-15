package com.layui.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.layui.model.User;
import com.layui.model.base.Result;

/**
 * @author chengchenrui
 * @version Id: UserInfoController.java, v 0.1 2017.12.13 11:14 chengchenrui Exp $$
 */
@Controller
@RequestMapping(value = "/user")
public class UserInfoController {

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Result<List<User>> list(HttpServletRequest httpServletRequest) {
        Result<List<User>> result = new Result<>();
        List<User> users = new ArrayList<>();
        User user;
        for (int i = 0; i < 20; i++) {
            user = new User();
            user.setId(i);
            user.setUserName("用户名——" + i);
            user.setSex("男");
            user.setCity("A");
            user.setSign("123");
            user.setExperience("100");
            user.setScore(i * 5 + "");
            user.setClassify("CEO");
            user.setWealth("FBS");
            users.add(user);
        }

        result.setCode("0");
        result.setMsg("");
        result.setCount(20);
        result.setData(users);

        return result;
    }

}
