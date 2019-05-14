package com.zh.program.Dao;

import com.zh.program.Entrty.ServiceProvider;
import java.util.List;
import java.util.Map;

public interface ServiceProviderMapper {
    int insert(ServiceProvider record);

    int insertSelective(ServiceProvider record);

    int updateByPrimaryKey(ServiceProvider record);

    int updateByPrimaryKeySelective(ServiceProvider record);

    int deleteByPrimaryKey(Integer id);

    ServiceProvider selectByPrimaryKey(Integer id);

    List<ServiceProvider> selectAll(Map<Object, Object> param);

    List<ServiceProvider> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}