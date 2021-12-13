package com.petlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RspController {

    //轉發DogFrom
    @RequestMapping("DogFrom")
    public String DogFrom(Model model) {

        return "DogFrom";
    }
    //轉發CatFrom
    @RequestMapping("CatFrom")
    public String CatFrom(Model model) {

        return "CatFrom";
    }

    @RequestMapping("comit")
    public String comit() {

        return "comit";
    }

    @RequestMapping("check")
    public String check() {

        return "Check";
    }


}
