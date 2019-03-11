package com.zh.program.Controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zh.program.Common.utils.RedisUtil;
import com.zh.program.Dao.UserDao;
import com.zh.program.Entrty.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {
    @Resource
    private RedisTemplate<String, String> redis;
    @Autowired
    private UserDao userDao;

    @RequestMapping("/view")
    public String view(){
        return "index.html";
    }

    @ResponseBody
    @RequestMapping("str")
    public String test(String str){
        RedisUtil.addString(redis, "test:" + str, str);
        User user = new User();
        user.setName("aaa");
        user.setPassword("123");
        userDao.save(user);
        return "true" + str;
    }
    @ResponseBody
    @RequestMapping("get")
    public String get(){
        List<User> list = userDao.findAll();
        return JSONObject.toJSONString(list);
    }
    @ResponseBody
    @RequestMapping("findByName")
    public String findByName(String name){
        User user = userDao.findByName(name);
        return JSONObject.toJSONString(user);
    }
    @ResponseBody
    @RequestMapping("query")
    public String query(String name){
        List<User> list = userDao.query(name);
        return JSONObject.toJSONString(list);
    }
}
