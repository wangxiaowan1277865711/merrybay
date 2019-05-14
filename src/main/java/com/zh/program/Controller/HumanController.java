package com.zh.program.Controller;

import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.Human;
import com.zh.program.Service.HumanService;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/human")
public class HumanController {

    @Autowired
    private HumanService humanService;

    /**
     * 获取人力资源列表
     * category 岗位类型 0:技术,1:销售,2:行政
     * @return
     */
    @ResponseBody
    @RequestMapping("/list")
    public String getAll(Integer category){
        if (category == null){
            return Result.toResult(ResultCode.PARAM_IS_BLANK);
        }
        Map<Object, Object> map = new HashMap<>();
        map.put("category", category);
         List<Human> humanList = humanService.selectAll(map);
         List<Human> humans = new LinkedList<>();
        for (Human list: humanList) {
            Human human = new Human();
            human.setId(list.getId());
            human.setCategory(list.getCategory());
            human.setPlace(list.getPlace());
            human.setEmail(list.getEmail());
            human.setPhone(list.getPhone());
            human.setUpdateTime(list.getUpdateTime());
            human.setNum(list.getNum());
            human.setYear(list.getYear());
            human.setJobsName(list.getJobsName());
            human.setJobsDuty(list.getJobsDuty());
            human.setJobsRequire(list.getJobsRequire());
            humans.add(human);
        }
        return Result.toResult(ResultCode.SUCCESS,humans);
    }
}
