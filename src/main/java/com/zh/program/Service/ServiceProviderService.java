package com.zh.program.Service;

import com.zh.program.Entrty.ServiceProvider;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:24:56
 **/ 
public interface ServiceProviderService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:24:56
     **/ 
    int insert(ServiceProvider record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:24:56
     **/ 
    int insertSelective(ServiceProvider record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:24:56
     **/ 
    int updateByPrimaryKey(ServiceProvider record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:24:56
     **/ 
    int updateByPrimaryKeySelective(ServiceProvider record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:24:56
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:24:56
     **/ 
    ServiceProvider selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:24:56
     **/ 
    List<ServiceProvider> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:24:56
     **/ 
    List<ServiceProvider> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:24:56
     **/ 
    int selectCount(Map<Object, Object> param);
}