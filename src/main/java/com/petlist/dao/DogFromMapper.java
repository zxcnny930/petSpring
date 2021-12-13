package com.petlist.dao;

import com.petlist.pojo.FromPojo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface DogFromMapper {
    //搜尋全部狗類黑名單
    @Select("SELECT * FROM petlist.dogfrom;")
    List<FromPojo> queryAllDog();
}
