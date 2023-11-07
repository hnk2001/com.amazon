package com.amazon.seller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    
    @RequestMapping(value="/index" ,method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin() {
        return "signin";
    }

    @RequestMapping(value="/signup", method = RequestMethod.GET)
    public String signup() {
        return "signup";
    }
    
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}