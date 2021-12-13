package com.petlist.service;

import com.petlist.dao.CatFromMapper;
import com.petlist.dao.CheckMapper;
import com.petlist.pojo.CheckPojo;
import com.petlist.pojo.FromPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckServiceImpl implements CheckService{

    @Autowired
    private CheckMapper checkMapper;

    @Override
    public List<CheckPojo> queryAllCheck() {
        return checkMapper.queryAllCheck();
    }

    @Override
    public void insertToDog() {
        checkMapper.adddog();
    }
}
