package com.petlist.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService{


    private AdminMapper adminMapper;

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public List<admin> queryAlladmin() {
        return adminMapper.queryAlladmin();
    }
}
