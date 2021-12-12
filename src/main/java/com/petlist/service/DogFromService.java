package com.petlist.service;

import com.petlist.pojo.FromPojo;
import com.petlist.pojo.admin;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface DogFromService {
    List<FromPojo> queryAllDog();
}
