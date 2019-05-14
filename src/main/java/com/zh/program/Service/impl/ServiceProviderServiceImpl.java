package com.zh.program.Service.impl;

import com.zh.program.Dao.ServiceProviderMapper;
import com.zh.program.Entrty.ServiceProvider;
import com.zh.program.Service.ServiceProviderService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:24:56
 **/ 
@Service("serviceProviderService")
public class ServiceProviderServiceImpl implements ServiceProviderService {
    @Resource
    private ServiceProviderMapper serviceProviderMapper;

    private static final Logger logger = LoggerFactory.getLogger(ServiceProviderServiceImpl.class);

    @Override
    public int insert(ServiceProvider record) {
        return this.serviceProviderMapper.insert(record);
    }

    @Override
    public int insertSelective(ServiceProvider record) {
        return this.serviceProviderMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(ServiceProvider record) {
        return this.serviceProviderMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(ServiceProvider record) {
        return this.serviceProviderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.serviceProviderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public ServiceProvider selectByPrimaryKey(Integer id) {
        return this.serviceProviderMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ServiceProvider> selectAll(Map<Object, Object> param) {
        return this.serviceProviderMapper.selectAll(param);
    }

    @Override
    public List<ServiceProvider> selectPaging(Map<Object, Object> param) {
        return this.serviceProviderMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.serviceProviderMapper.selectCount(param);
    }
}