package com.zh.program.Dao;

import com.zh.program.Entrty.Human;
import java.util.List;
import java.util.Map;

public interface HumanMapper {
    int insert(Human record);

    int insertSelective(Human record);

    int updateByPrimaryKey(Human record);

    int updateByPrimaryKeySelective(Human record);

    int deleteByPrimaryKey(Integer id);

    Human selectByPrimaryKey(Integer id);

    List<Human> selectAll(Map<Object, Object> param);

    List<Human> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}