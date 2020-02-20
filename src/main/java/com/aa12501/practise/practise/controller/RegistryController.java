package com.aa12501.practise.practise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistryController {
    @GetMapping("/registry")
    public String registry(){

        return "registry";
    }
}
