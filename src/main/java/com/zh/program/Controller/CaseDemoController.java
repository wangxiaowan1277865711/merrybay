package com.zh.program.Controller;

import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.CaseDemo;
import com.zh.program.Service.CaseDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/caseDemo")
public class CaseDemoController {
    @Autowired
    private CaseDemoService caseDemoService;

    /**
     * 显示案例详情
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping("/details")
    public String getDetails(Integer id){
        if (id == null || "".equals(id)){
            return Result.toResult(ResultCode.PARAM_TYPE_BIND_ERROQ);
        }
        return Result.toResult(ResultCode.SUCCESS,caseDemoService.selectByPrimaryKey(id));
    }

    /**
     * 显示推荐案例
     * @return
     */
    @ResponseBody
    @RequestMapping("/recommendCase")
    public String getRecommendCase(){
        Map<Object, Object> map = new HashMap<>();
        List<CaseDemo> caseDemoList = caseDemoService.selectRecommendCase(map);
        return Result.toResult(ResultCode.SUCCESS,caseDemoList);
    }
}
