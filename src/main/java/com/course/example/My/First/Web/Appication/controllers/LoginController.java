package com.course.example.My.First.Web.Appication.controllers;


import com.course.example.My.First.Web.Appication.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String validateLogin(ModelMap modelMap, @RequestParam String user, @RequestParam String  password){
        if(!loginService.isCredentialsValidated(user, password)){
            modelMap.put("errorMessage", "Invalid Credentials");
            return "login";
        }
        modelMap.put("user", user);
        return "welcome";
    }

}
