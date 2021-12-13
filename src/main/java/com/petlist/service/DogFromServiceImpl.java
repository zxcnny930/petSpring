package com.petlist.service;

import com.petlist.dao.DogFromMapper;
import com.petlist.pojo.FromPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogFromServiceImpl implements DogFromService{
    @Autowired
    private DogFromMapper dogFromMapper;



    @Override

    public List<FromPojo> queryAllDog() {

        return dogFromMapper.queryAllDog();
    }
}
