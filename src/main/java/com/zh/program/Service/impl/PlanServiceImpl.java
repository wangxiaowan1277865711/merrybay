package com.zh.program.Service.impl;

import com.zh.program.Dao.PlanMapper;
import com.zh.program.Entrty.Plan;
import com.zh.program.Service.PlanService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:27:33
 **/ 
@Service("planService")
public class PlanServiceImpl implements PlanService {
    @Resource
    private PlanMapper planMapper;

    private static final Logger logger = LoggerFactory.getLogger(PlanServiceImpl.class);

    @Override
    public int insert(Plan record) {
        return this.planMapper.insert(record);
    }

    @Override
    public int insertSelective(Plan record) {
        return this.planMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Plan record) {
        return this.planMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Plan record) {
        return this.planMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.planMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Plan selectByPrimaryKey(Integer id) {
        return this.planMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Plan> selectAll(Map<Object, Object> param) {
        return this.planMapper.selectAll(param);
    }

    @Override
    public List<Plan> selectPaging(Map<Object, Object> param) {
        return this.planMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.planMapper.selectCount(param);
    }
}