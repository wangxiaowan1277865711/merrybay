package com.zh.program.Dao;

import com.zh.program.Entrty.Companyinformation;
import java.util.List;
import java.util.Map;

public interface CompanyinformationMapper {
    int insert(Companyinformation record);

    int insertSelective(Companyinformation record);

    int updateByPrimaryKey(Companyinformation record);

    int updateByPrimaryKeySelective(Companyinformation record);

    int deleteByPrimaryKey(Integer id);

    Companyinformation selectByPrimaryKey(Integer id);

    List<Companyinformation> selectAll(Map<Object, Object> param);

    List<Companyinformation> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}