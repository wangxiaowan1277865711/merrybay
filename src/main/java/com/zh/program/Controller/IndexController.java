package com.zh.program.Controller;

import com.alibaba.fastjson.JSONObject;
import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.*;
import com.zh.program.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/index")
public class IndexController {


    @Autowired
    private FriendshipLinkService friendshipLinkService;

    @Autowired
    private CompanyinformationService comService;

    /**
     * 获取友情链接
     * @return
     */
    @ResponseBody
    @RequestMapping("/friendshipLink")
    public String getAll(){
        Map<Object, Object> map = new HashMap<>();
        List<FriendshipLink> flList = friendshipLinkService.selectAll(map);
        List<FriendshipLink> links = new LinkedList<>();
        for (FriendshipLink friendshipLink: flList) {
            FriendshipLink fl = new FriendshipLink();
            fl.setTitle(friendshipLink.getTitle());
            fl.setHref(friendshipLink.getHref());
            links.add(fl);
        }
        return Result.toResult(ResultCode.SUCCESS,links);
    }

    /**
     * 首页显示公司信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/information")
    public String getInformation(){
        Map<Object, Object> map = new HashMap<>();
        List<Companyinformation> comList = comService.selectAll(map);
        if (comList.size() == 0){
            return Result.toResult(ResultCode.RESULE_DATA_NONE);
        }
        Companyinformation companyinformation = comList.get(0);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("companyName",companyinformation.getCompanyName());
        jsonObject.put("address",companyinformation.getAddress());
        jsonObject.put("phone",companyinformation.getPhone());
        return  Result.toResult(ResultCode.SUCCESS,jsonObject);
    }


}
