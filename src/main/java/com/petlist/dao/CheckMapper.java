package com.petlist.dao;

import com.petlist.pojo.CheckPojo;
import com.petlist.pojo.FromPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CheckMapper {
    @Select("SELECT * FROM petlist.check;")
    List<CheckPojo> queryAllCheck();
}
