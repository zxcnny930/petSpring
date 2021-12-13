package com.petlist.controller;

import com.petlist.pojo.ComitPojo;
import com.petlist.service.CheckServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckController {

    @Autowired
    private CheckServiceImpl checkService;
    @RequestMapping("OK")
    public void OK(@RequestParam("data") ComitPojo comitPojo){
        if (comitPojo.getPet()==1){
            checkService.insertToDog();
        }

    }
    @RequestMapping("NO")
    public void NO(){

    }

}
