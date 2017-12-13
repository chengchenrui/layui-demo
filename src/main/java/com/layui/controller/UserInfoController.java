package com.layui.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public ModelMap list(HttpServletRequest httpServletRequest) {
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

        ModelMap modelMap = new ModelMap();
        modelMap.put("code", "0");
        modelMap.put("msg", "");
        modelMap.put("count", "20");
        modelMap.put("data", users);
        return modelMap;
    }

}
