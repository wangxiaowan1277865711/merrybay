package com.zh.program.Controller;

import com.zh.program.Common.utils.RedisUtil;
import com.zh.program.Dao.UserDao;
import com.zh.program.Entrty.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
}
