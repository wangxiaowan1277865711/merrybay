package com.zh.program.Dao;

import com.zh.program.Entrty.Partners;
import java.util.List;
import java.util.Map;

public interface PartnersMapper {
    int insert(Partners record);

    int insertSelective(Partners record);

    int updateByPrimaryKey(Partners record);

    int updateByPrimaryKeySelective(Partners record);

    int deleteByPrimaryKey(Integer id);

    Partners selectByPrimaryKey(Integer id);

    List<Partners> selectAll(Map<Object, Object> param);

    List<Partners> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);

    List<Partners> selects(Map<Object, Object> param);
}