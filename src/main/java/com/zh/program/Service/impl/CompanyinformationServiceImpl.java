package com.zh.program.Service.impl;

import com.zh.program.Dao.CompanyinformationMapper;
import com.zh.program.Entrty.Companyinformation;
import com.zh.program.Service.CompanyinformationService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-09 11:24:51
 **/ 
@Service("companyinformationService")
public class CompanyinformationServiceImpl implements CompanyinformationService {
    @Resource
    private CompanyinformationMapper companyinformationMapper;

    private static final Logger logger = LoggerFactory.getLogger(CompanyinformationServiceImpl.class);

    @Override
    public int insert(Companyinformation record) {
        return this.companyinformationMapper.insert(record);
    }

    @Override
    public int insertSelective(Companyinformation record) {
        return this.companyinformationMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Companyinformation record) {
        return this.companyinformationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Companyinformation record) {
        return this.companyinformationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.companyinformationMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Companyinformation selectByPrimaryKey(Integer id) {
        return this.companyinformationMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Companyinformation> selectAll(Map<Object, Object> param) {
        return this.companyinformationMapper.selectAll(param);
    }

    @Override
    public List<Companyinformation> selectPaging(Map<Object, Object> param) {
        return this.companyinformationMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.companyinformationMapper.selectCount(param);
    }
}