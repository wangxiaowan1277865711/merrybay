package com.zh.program.Dao;

import com.zh.program.Entrty.Plan;
import java.util.List;
import java.util.Map;

public interface PlanMapper {
    int insert(Plan record);

    int insertSelective(Plan record);

    int updateByPrimaryKey(Plan record);

    int updateByPrimaryKeySelective(Plan record);

    int deleteByPrimaryKey(Integer id);

    Plan selectByPrimaryKey(Integer id);

    List<Plan> selectAll(Map<Object, Object> param);

    List<Plan> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}