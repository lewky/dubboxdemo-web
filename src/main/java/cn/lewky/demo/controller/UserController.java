// Copyright (c) 2018-2018 Lewis.Liu Limited. All rights reserved.
// Contact with me on Github - https://github.com/lewky
// ============================================================================
// CURRENT VERSION dubboxdemo-web.1.0.0
// ============================================================================
// CHANGE LOG
// dubboxdemo-web.1.0.0 : 2018-10-01, Lewis.Liu created
// ============================================================================
package cn.lewky.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.lewky.demo.service.UserService;

/**
 * @author Lewis.Liu
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/name")
    @ResponseBody
    public String showName() {

        return userService.getName();
    }
}
