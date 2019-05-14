package com.zh.program.Service;

import com.zh.program.Entrty.Partners;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:29:27
 **/ 
public interface PartnersService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:29:27
     **/ 
    int insert(Partners record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:29:27
     **/ 
    int insertSelective(Partners record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:29:27
     **/ 
    int updateByPrimaryKey(Partners record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:29:27
     **/ 
    int updateByPrimaryKeySelective(Partners record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:29:27
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:29:27
     **/ 
    Partners selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:29:27
     **/ 
    List<Partners> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:29:27
     **/ 
    List<Partners> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:29:27
     **/ 
    int selectCount(Map<Object, Object> param);

    List<Partners> selects(Map<Object, Object> map);
}