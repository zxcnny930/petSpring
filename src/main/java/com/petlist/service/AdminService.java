package com.petlist.service;

import com.petlist.pojo.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface AdminService {
    List<admin> queryAlladmin();
}
