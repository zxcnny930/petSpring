package com.petlist.controller;

import com.petlist.pojo.admin;
import com.petlist.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/admin")
public class adminController {

    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;



    @RequestMapping("/alladmin")
    public String list(Model model) {
        List<admin> list = adminService.queryAlladmin();
        model.addAttribute("list", list);
        return "allAdmin";
    }
}
