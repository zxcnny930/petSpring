package com.petlist.controller;
import com.google.gson.Gson;
import com.petlist.pojo.FromPojo;
import com.petlist.service.CatFromService;
import com.petlist.service.DogFromService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AjaxController {
    @Autowired
    @Qualifier("DogFromServiceImpl")
    private DogFromService dogFromService;
    @Autowired
    @Qualifier("CatFromServiceImpl")
    private CatFromService catFromService;

    @RequestMapping("/getCatFrom")
    public List<FromPojo> catFrom() {
        List<FromPojo> fromPojos = catFromService.queryAllCat();

        return fromPojos;
    }
    @RequestMapping("/getDogFrom")
    public List<FromPojo> DogFrom() {
        List<FromPojo> fromPojos = dogFromService.queryAllDog();

        return fromPojos;
    }
}

