package com.petlist.controller;

import com.petlist.pojo.FromPojo;
import com.petlist.service.AdminService;
import com.petlist.service.CatFromService;
import com.petlist.service.DogFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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


}
