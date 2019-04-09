package com.gmail.solovev.controller;

import com.gmail.solovev.service.UserServiceImpl;
import com.gmail.solovev.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class UserDataImplController {

    @RequestMapping(value = "/fiveTopForm")
    public String showForms(Model model) {
        List<UserData> fiveForms = new UserServiceImpl().getFiveTopForms();
        model.addAttribute("fiveForms", fiveForms);
        return "showFiveTopForms";

    }

    @RequestMapping(value = "/lastHour")
    public String showUsedForms(Model model) {
        List<UserData> usedForms = new UserServiceImpl().getUsedFormForLastHour();
        model.addAttribute("usedForms", usedForms);
        return "usedFormForLastHour";
    }

    @RequestMapping(value = "/unfinishedUser")
    public String showUnfinishedUsers(Model model) {
        List<UserData> unfinishedUsers = new UserServiceImpl().getUnfinishedUsers();
        model.addAttribute("unfinishedUsers", unfinishedUsers);
        return "unfinishedUsers";
    }
}
