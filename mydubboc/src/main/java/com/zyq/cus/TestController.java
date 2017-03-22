package com.zyq.cus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zyq.service.TestService;
import com.zyq.service.User;

@Controller
public class TestController {
    @Autowired
    private TestService testService;
    
    @RequestMapping("/test")
    @ResponseBody
    public String get(User user){
        System.out.println(1);
        user=testService.get(user);
        System.out.println(user.getName());
        System.out.println(2);
        return user.getName();
    }
}
