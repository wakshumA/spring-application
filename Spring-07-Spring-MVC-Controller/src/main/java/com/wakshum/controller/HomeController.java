package com.wakshum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }

    @RequestMapping("/welcome")
    public String home2() {
        return "welcome.html";
    }


    @RequestMapping     //return localhost:8080/
    public String home3() {
        return "welcome.html";
    }


}
