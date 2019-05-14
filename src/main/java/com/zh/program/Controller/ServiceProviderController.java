package com.zh.program.Controller;

import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.ServiceProvider;
import com.zh.program.Service.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/service")
public class ServiceProviderController {

    @Autowired
    private ServiceProviderService sps;

    @ResponseBody
    @RequestMapping("/list")
    public String getType(Integer type){
        if (type ==1){
            return
        }
        return "";
    }

    /**
     * 获取服务类型 0:APP开发,1:网站建设,2:微信小程序
     */
    @ResponseBody
    @RequestMapping("/list")
    public String getAll(){
        Map<Object, Object> map = new HashMap<>();
        List<ServiceProvider> list = sps.selectAll(map);
        List<ServiceProvider> serviceProviders = new LinkedList<>();
        for (ServiceProvider serviceProvider:list) {
            ServiceProvider serviceProvider1 = new ServiceProvider();
            serviceProvider1.setId(serviceProvider.getId());
            serviceProvider1.setType(serviceProvider.getType());
            serviceProvider1.setImgLink(serviceProvider.getImgLink());
            serviceProviders.add(serviceProvider);
        }
        return Result.toResult(ResultCode.SUCCESS, serviceProviders);
    }

}
