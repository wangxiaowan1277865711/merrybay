package com.zh.program.Dao;

import com.zh.program.Entrty.CaseDemo;
import java.util.List;
import java.util.Map;

public interface CaseDemoMapper {
    int insert(CaseDemo record);

    int insertSelective(CaseDemo record);

    int updateByPrimaryKey(CaseDemo record);

    int updateByPrimaryKeySelective(CaseDemo record);

    int deleteByPrimaryKey(Integer id);

    CaseDemo selectByPrimaryKey(Integer id);

    List<CaseDemo> selectAll(Map<Object, Object> param);

    List<CaseDemo> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);

    List<CaseDemo> selectType(Map<Object, Object> param);

    List<CaseDemo> selectRecommendCase(Map<Object, Object> param);
}