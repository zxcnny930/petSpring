package com.petlist.service;

import com.petlist.dao.CatFromMapper;
import com.petlist.pojo.FromPojo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatFromServiceImpl implements CatFromService{


    private CatFromMapper catFromMapper;

    public void setCatFromMapper(CatFromMapper catFromMapper) {
        this.catFromMapper = catFromMapper;
    }

    @Override
    public List<FromPojo> queryAllCat() {
        return catFromMapper.queryAllCat();
    }
}
