package com.petlist.dao;

import com.petlist.pojo.CheckPojo;
import com.petlist.pojo.FromPojo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CheckMapper {
    @Select("SELECT * FROM petlist.check;")
    List<CheckPojo> queryAllCheck();

    @Insert("INSERT INTO petlist.catfrom(pet,name,gender,location,date,phone,prove) VALUES(#{pet},#{name},#{gender},#{location},#{date},#{phone},#{prove})")
    int addcat(FromPojo fromPojo);

    @Insert("INSERT INTO petlist.catfrom(pet,name,gender,location,date,phone,prove) VALUES(#{pet},#{name},#{gender},#{location},#{date},#{phone},#{prove})")
    int adddog(FromPojo fromPojo);

    @Delete("DELETE FROM petlist.check WHERE (id = #{id);")
    int deleteCheck(int id);

}
