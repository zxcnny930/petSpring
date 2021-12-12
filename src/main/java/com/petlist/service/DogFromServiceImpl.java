package com.petlist.service;

import com.petlist.dao.DogFromMapper;
import com.petlist.pojo.FromPojo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogFromServiceImpl implements DogFromService{

    private DogFromMapper dogFromMapper;

    public void setDogFromMapper(DogFromMapper dogFromMapper) {
        this.dogFromMapper = dogFromMapper;
    }

    @Override
    public List<FromPojo> queryAllDog() {
        return dogFromMapper.queryAllDog();
    }
}
