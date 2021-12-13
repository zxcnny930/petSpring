package com.petlist.dao;

import com.petlist.pojo.FromPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface CatFromMapper {
    @Select("SELECT * FROM petlist.catfrom;")
    List<FromPojo> queryAllCat();
}
