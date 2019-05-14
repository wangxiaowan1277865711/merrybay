package com.zh.program.Service.impl;

import com.zh.program.Dao.PartnersMapper;
import com.zh.program.Entrty.Partners;
import com.zh.program.Service.PartnersService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:29:27
 **/ 
@Service("partnersService")
public class PartnersServiceImpl implements PartnersService {
    @Resource
    private PartnersMapper partnersMapper;

    private static final Logger logger = LoggerFactory.getLogger(PartnersServiceImpl.class);

    @Override
    public int insert(Partners record) {
        return this.partnersMapper.insert(record);
    }

    @Override
    public int insertSelective(Partners record) {
        return this.partnersMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Partners record) {
        return this.partnersMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Partners record) {
        return this.partnersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.partnersMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Partners selectByPrimaryKey(Integer id) {
        return this.partnersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Partners> selectAll(Map<Object, Object> param) {
        return this.partnersMapper.selectAll(param);
    }

    @Override
    public List<Partners> selectPaging(Map<Object, Object> param) {
        return this.partnersMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.partnersMapper.selectCount(param);
    }

    @Override
    public List<Partners> selects(Map<Object, Object> param) {
        return this.partnersMapper.selects(param);
    }
}