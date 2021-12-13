package com.petlist.controller;


import com.petlist.service.comitListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class comitController {
    @Autowired
    private comitListService comitListService;

    @ModelAttribute
    @RequestMapping(value="comitList")
    public String comitList(@RequestParam("pet") String pet, @RequestParam("Name") String Name,@RequestParam("gender") String gender,@RequestParam("location") String location,@RequestParam("date") String date,@RequestParam("phone") Integer phone,@RequestParam("prove") String prove, Map<String, Object> map) {

        map.put("pet",pet);
        map.put("name",Name);
        map.put("gender",gender);
        map.put("location",location);
        map.put("date",date);
        map.put("phone",phone);
        map.put("prove",prove);
        comitListService.comitList(map);
    return "comitList";
    }



}
