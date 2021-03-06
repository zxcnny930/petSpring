package com.petlist.service;

import com.petlist.dao.CatFromMapper;
import com.petlist.pojo.FromPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatFromServiceImpl implements CatFromService{

    @Autowired
    private CatFromMapper catFromMapper;


    @Override
    public List<FromPojo> queryAllCat() {
        return catFromMapper.queryAllCat();
    }
}
