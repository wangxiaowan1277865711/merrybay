package com.zh.program.Service.impl;

import com.zh.program.Dao.ConsultingserviceMapper;
import com.zh.program.Entrty.Consultingservice;
import com.zh.program.Service.ConsultingserviceService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:28:57
 **/ 
@Service("consultingserviceService")
public class ConsultingserviceServiceImpl implements ConsultingserviceService {
    @Resource
    private ConsultingserviceMapper consultingserviceMapper;

    private static final Logger logger = LoggerFactory.getLogger(ConsultingserviceServiceImpl.class);

    @Override
    public int insert(Consultingservice record) {
        return this.consultingserviceMapper.insert(record);
    }

    @Override
    public int insertSelective(Consultingservice record) {
        return this.consultingserviceMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Consultingservice record) {
        return this.consultingserviceMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Consultingservice record) {
        return this.consultingserviceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.consultingserviceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Consultingservice selectByPrimaryKey(Integer id) {
        return this.consultingserviceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Consultingservice> selectAll(Map<Object, Object> param) {
        return this.consultingserviceMapper.selectAll(param);
    }

    @Override
    public List<Consultingservice> selectPaging(Map<Object, Object> param) {
        return this.consultingserviceMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.consultingserviceMapper.selectCount(param);
    }
}