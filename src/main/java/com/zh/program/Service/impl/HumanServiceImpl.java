package com.zh.program.Service.impl;

import com.zh.program.Dao.HumanMapper;
import com.zh.program.Entrty.Human;
import com.zh.program.Service.HumanService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:28:37
 **/ 
@Service("humanService")
public class HumanServiceImpl implements HumanService {
    @Resource
    private HumanMapper humanMapper;

    private static final Logger logger = LoggerFactory.getLogger(HumanServiceImpl.class);

    @Override
    public int insert(Human record) {
        return this.humanMapper.insert(record);
    }

    @Override
    public int insertSelective(Human record) {
        return this.humanMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Human record) {
        return this.humanMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Human record) {
        return this.humanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.humanMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Human selectByPrimaryKey(Integer id) {
        return this.humanMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Human> selectAll(Map<Object, Object> param) {
        return this.humanMapper.selectAll(param);
    }

    @Override
    public List<Human> selectPaging(Map<Object, Object> param) {
        return this.humanMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.humanMapper.selectCount(param);
    }
}