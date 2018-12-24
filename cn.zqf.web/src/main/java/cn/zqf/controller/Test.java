package cn.zqf.controller;

import cn.zqf.domain.User;
import cn.zqf.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class Test {

    @Autowired
    private Userservice userService;

    @RequestMapping("/findAll")
    public String findAll(){
        List<User> users = userService.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        return "success";
    }


}
