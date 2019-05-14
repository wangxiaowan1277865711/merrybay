package com.zh.program.Service;

import com.zh.program.Entrty.Plan;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:27:33
 **/ 
public interface PlanService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:27:33
     **/ 
    int insert(Plan record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:27:33
     **/ 
    int insertSelective(Plan record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:27:33
     **/ 
    int updateByPrimaryKey(Plan record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:27:33
     **/ 
    int updateByPrimaryKeySelective(Plan record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:27:33
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:27:33
     **/ 
    Plan selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:27:33
     **/ 
    List<Plan> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:27:33
     **/ 
    List<Plan> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:27:33
     **/ 
    int selectCount(Map<Object, Object> param);
}