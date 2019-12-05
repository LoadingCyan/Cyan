package com.cvit.gmall.user.controller;

import com.cvit.gmall.user.bean.UmsMember;
import com.cvit.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

@Autowired
    UserService userService;
//      测试
        @RequestMapping("index")
        @ResponseBody
        public String index(){
            return "Hello User";
        }

//      得到所有的用户
        @RequestMapping(value = "getAllUser",produces = {"application/json;charset=UTF-8"})
        @ResponseBody
        public List<UmsMember> gatAllUser(){
            List<UmsMember> umsMembers = userService.getAllUser();
            return umsMembers;
        }
}
