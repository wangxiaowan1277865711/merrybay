package com.zh.program.Dao;

import com.zh.program.Entrty.Consultingservice;
import java.util.List;
import java.util.Map;

public interface ConsultingserviceMapper {
    int insert(Consultingservice record);

    int insertSelective(Consultingservice record);

    int updateByPrimaryKey(Consultingservice record);

    int updateByPrimaryKeySelective(Consultingservice record);

    int deleteByPrimaryKey(Integer id);

    Consultingservice selectByPrimaryKey(Integer id);

    List<Consultingservice> selectAll(Map<Object, Object> param);

    List<Consultingservice> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}