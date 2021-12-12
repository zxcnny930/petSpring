package com.petlist.service;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface AdminService {
    List<admin> queryAlladmin();
}
