package com.zh.program.Controller;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Common.utils.ValidateUtils;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.Companyinformation;
import com.zh.program.Entrty.Consultingservice;
import com.zh.program.Service.CompanyinformationService;
import com.zh.program.Service.ConsultingserviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/consulting")
public class ConsultingServiceController {

    @Autowired
    private ConsultingserviceService service;

    @Autowired
    private CompanyinformationService companyinformationService;

    /**
     * 咨询服务显示公司信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/list")
    public String getAll(){
        Map<Object, Object> map = new HashMap<>();
        List<Companyinformation> list = companyinformationService.selectAll(map);
        if(list.size() == 0){
            return Result.toResult(ResultCode.RESULE_DATA_NONE);
        }
        Companyinformation companyinformation = list.get(0);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("companyName", companyinformation.getCompanyName());
        jsonObject.put("phone", companyinformation.getPhone());
        jsonObject.put("email", companyinformation.getEmail());
        jsonObject.put("address", companyinformation.getAddress());
        return Result.toResult(ResultCode.SUCCESS, jsonObject);
    }

    /**
         * 插入咨询信息公司信息到数据库
     * @param consultingservice
     * @return
     */
    @ResponseBody
    @RequestMapping("/insert")
    public String insert(Consultingservice consultingservice){
        /**
         * 判断用户名是否为空
         */
        if("".equals(consultingservice.getName()) || consultingservice.getName() == null){
            return Result.toResult(ResultCode.USER_NOT_REALNAME);
        }
        /**
         * 判断手机号码是否为空
         */
        if ("".equals(consultingservice.getPhone()) || consultingservice.getPhone() == null){
            return Result.toResult(ResultCode.SMS_FREQUENT_SEND);
        }
        /**
         * 判断是否为手机号
         */
        if(!ValidateUtils.isPhone(consultingservice.getPhone())){
            return Result.toResult(ResultCode.SMS_CHECK_ERROR);
        }
        /**
         *判断邮箱格式是否正确
         */
        if (!"".equals(consultingservice.getEmail()) && consultingservice.getEmail() !=null){
            if(!ValidateUtils.isEmail(consultingservice.getEmail())){
                return Result.toResult(ResultCode.UPDATE_DATA_NOT_EXIST);
            }
        }

        service.insertSelective(consultingservice);
        return Result.toResult(ResultCode.SUCCESS);
    }

}
