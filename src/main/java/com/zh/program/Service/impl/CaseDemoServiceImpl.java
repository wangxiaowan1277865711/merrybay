package com.zh.program.Service.impl;

import com.zh.program.Dao.CaseDemoMapper;
import com.zh.program.Entrty.CaseDemo;
import com.zh.program.Service.CaseDemoService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:26:51
 **/ 
@Service("caseDemoService")
public class CaseDemoServiceImpl implements CaseDemoService {
    @Resource
    private CaseDemoMapper caseDemoMapper;

    private static final Logger logger = LoggerFactory.getLogger(CaseDemoServiceImpl.class);

    @Override
    public int insert(CaseDemo record) {
        return this.caseDemoMapper.insert(record);
    }

    @Override
    public int insertSelective(CaseDemo record) {
        return this.caseDemoMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(CaseDemo record) {
        return this.caseDemoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(CaseDemo record) {
        return this.caseDemoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.caseDemoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public CaseDemo selectByPrimaryKey(Integer id) {
        return this.caseDemoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CaseDemo> selectAll(Map<Object, Object> param) {
        return this.caseDemoMapper.selectAll(param);
    }

    @Override
    public List<CaseDemo> selectPaging(Map<Object, Object> param) {
        return this.caseDemoMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.caseDemoMapper.selectCount(param);
    }

    @Override
    public List<CaseDemo> selectType(Map<Object, Object> param) {
        return this.caseDemoMapper.selectType(param);
    }

    @Override
    public List<CaseDemo> selectRecommendCase(Map<Object, Object> param) {
        return this.caseDemoMapper.selectRecommendCase(param);
    }
}