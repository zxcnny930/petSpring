package com.petlist.service;

import com.petlist.dao.comitListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class comitListServiceImpl implements comitListService{

    @Autowired
    private comitListMapper comitListMapper;

    @Override
    public void comitList(Map<String, Object> map) {
        comitListMapper.comitList(map);
    }
}
