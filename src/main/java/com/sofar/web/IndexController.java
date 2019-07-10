package com.sofar.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/earth")
    public String earth(Model model) {
        return "earth";
    }

    @RequestMapping("/jupiter")
    public String jupiter(Model model) {
        return "jupiter";
    }

    @RequestMapping("/moon")
    public String moon(Model model) {
        return "moon";
    }
}