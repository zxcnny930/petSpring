package com.petlist.service;

import com.petlist.dao.AdminMapper;
import com.petlist.pojo.admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
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
