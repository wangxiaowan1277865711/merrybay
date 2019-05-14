package com.zh.program.Service;

import com.zh.program.Entrty.Consultingservice;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:28:57
 **/ 
public interface ConsultingserviceService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:57
     **/ 
    int insert(Consultingservice record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:57
     **/ 
    int insertSelective(Consultingservice record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:57
     **/ 
    int updateByPrimaryKey(Consultingservice record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:57
     **/ 
    int updateByPrimaryKeySelective(Consultingservice record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:57
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:57
     **/ 
    Consultingservice selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:57
     **/ 
    List<Consultingservice> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:57
     **/ 
    List<Consultingservice> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-05-08 14:28:57
     **/ 
    int selectCount(Map<Object, Object> param);
}