package com.oa.oa.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.oa.oa.bean.SendTable;

@Mapper
public interface SendTableDao {
    int insert(@Param("pojo") SendTable pojo);

    int insertSelective(@Param("pojo") SendTable pojo);

    int insertList(@Param("pojos") List<SendTable> pojo);

    int update(@Param("pojo") SendTable pojo);

    List<SendTable> getAll();
}
