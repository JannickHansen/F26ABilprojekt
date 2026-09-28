package org.example.f26abilprojekt.controller;

import org.example.f26abilprojekt.config.InitData;
import org.example.f26abilprojekt.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class PageController {

    @Autowired
    InitData initData;

    @GetMapping("/")
    public String mainPage(Model model) {
        ArrayList<Car> carlist = new ArrayList<>();
        carlist.addAll(initData.getCarList());
        model.addAttribute("carList", carlist);
        return "index";
    }
}














