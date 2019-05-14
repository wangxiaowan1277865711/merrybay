package com.zh.program.Service;

import com.zh.program.Entrty.Human;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:28:37
 **/ 
public interface HumanService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:37
     **/ 
    int insert(Human record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:37
     **/ 
    int insertSelective(Human record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:37
     **/ 
    int updateByPrimaryKey(Human record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:37
     **/ 
    int updateByPrimaryKeySelective(Human record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:37
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:37
     **/ 
    Human selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:37
     **/ 
    List<Human> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:37
     **/ 
    List<Human> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:37
     **/ 
    int selectCount(Map<Object, Object> param);
}