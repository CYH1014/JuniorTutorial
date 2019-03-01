package com.rh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sweehaw
 */
@Controller
public class MainController {

    @GetMapping("main")
    public String mainPage() {
        return "main";
    }
}
