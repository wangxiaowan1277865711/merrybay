package com.zh.program.Controller;

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
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private BannerService bannerService;
    @Autowired
    private PartnersService partnersService;
    @Autowired
    private NewsService newsService;
    @Autowired
    private CaseDemoService caseDemoService;

    @ResponseBody
    @RequestMapping("/list")
    public String getAll(){
        return Result.toResult(ResultCode.SUCCESS);
    }
    /**
     * 获取首页信息
     */
    @ResponseBody
    @RequestMapping("")
    public String getIndex(){
        /**
         * 首页显示图片
         */
        Map<Object, Object> map = new HashMap<>();
        List<Banner> banners = bannerService.selectAll(map);
        List<Banner> bannerList = new LinkedList<>();
        for (Banner banner: banners) {
            Banner banner1 = new Banner();
            banner1.setLink(banner.getLink());
            banner1.setImgLink(banner.getImgLink());
            bannerList.add(banner1);
        }
        Map<Object, Object> data = new HashMap<>();
        data.put("img",bannerList);
        /**
         * 首页显示最近作品
         */
        List<CaseDemo> caseDemoList = caseDemoService.selectType(map);
        List<CaseDemo> caseDemos = new LinkedList<>();
        for (CaseDemo ca: caseDemoList) {
            CaseDemo caseDemo = new CaseDemo();
            caseDemo.setId(ca.getId());
            caseDemo.setImgLink(ca.getImgLink());
            caseDemo.setTitle(ca.getTitle());
            caseDemo.setServiceId(ca.getServiceId());

            caseDemos.add(caseDemo);
        }
        data.put("type",caseDemos);
        /**
         * 首页显示资讯共享
         */
        List<News> newsList = newsService.selectAll(map);
        List<News> list = new LinkedList<>();
        for (News news: newsList) {
            News news1 = new News();
            news1.setId(news.getId());
            news1.setImgLink(news.getImgLink());
            news1.setTitle(news.getTitle());
            news1.setDescribe(news.getDescribe());
            news1.setUpdateTime(news.getUpdateTime());
            list.add(news1);
        }
        data.put("news",list);
        /**
         * 首页显示麦贝合作伙伴
         */
        List<Partners> partnersList = partnersService.selects(map);
        List<Partners> partners2 = new LinkedList<>();
        for (Partners partners: partnersList) {
            Partners partners1 = new Partners();
            partners1.setImgName(partners.getImgName());
            partners1.setImgLink(partners.getImgLink());
            partners1.setLink(partners.getLink());
            partners2.add(partners1);
        }
        data.put("partners",partners2);
        return Result.toResult(ResultCode.SUCCESS,data);
    }
}
