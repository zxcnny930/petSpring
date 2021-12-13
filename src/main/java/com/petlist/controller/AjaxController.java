package com.petlist.controller;
import com.google.gson.Gson;
import com.petlist.pojo.CheckPojo;
import com.petlist.pojo.FromPojo;
import com.petlist.service.CatFromService;
import com.petlist.service.CheckService;
import com.petlist.service.DogFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AjaxController {
    @Autowired
    private DogFromService dogFromService;
    @Autowired
    private CatFromService catFromService;
    @Autowired
    private CheckService checkService;
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
    @RequestMapping("/getCheck")
    public List<CheckPojo> getCheck() {
        List<CheckPojo> fromPojos = checkService.queryAllCheck();

        return fromPojos;
    }
}

