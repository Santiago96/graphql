package com.course.example.My.First.Web.Appication.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {


    public boolean isCredentialsValidated(String user, String password) {
        return user.equalsIgnoreCase("santiago") &&
                password.equalsIgnoreCase("123");
    }
}
