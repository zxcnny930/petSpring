package com.petlist.service;

import com.petlist.pojo.FromPojo;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface CatFromService {
    List<FromPojo> queryAllCat();
}
