package com.petlist.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface comitListMapper {
    @Insert("INSERT INTO petlist.check(pet,name,gender,location,date,phone,prove) VALUES(#{pet},#{name},#{gender},#{location},#{date},#{phone},#{prove})")
    void comitList(Map<String,Object> map);
}
