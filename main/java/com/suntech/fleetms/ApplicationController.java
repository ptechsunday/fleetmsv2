package com.suntech.fleetms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String showHome(){
        return "index";
    }
    @GetMapping("/widgets")
    public String showWidgets(){
        return "widgets";
    }
}

