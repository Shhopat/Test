package com.example.SpringSecurityApp.controller;

import com.example.SpringSecurityApp.Test;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    //works only for role ADMIN or USER
    public String getHello() {
        System.out.println("вызван контроллер hello");
        return "hello";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    //works only for role ADMIN
    public String admitPage() {
        return "admin";
    }


}
