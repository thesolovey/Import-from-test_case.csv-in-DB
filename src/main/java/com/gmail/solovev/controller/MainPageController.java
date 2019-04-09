package com.gmail.solovev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping(value = "/main-page")

    public String getMainPage(Model model) {

        return "mainPage";

    }
}