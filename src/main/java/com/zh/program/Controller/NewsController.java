package com.zh.program.Controller;

import com.zh.program.Common.enums.ResultCode;
import com.zh.program.Dto.Result;
import com.zh.program.Entrty.News;
import com.zh.program.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    /**
     *获取新闻列表
     * type 新闻类型 0:行业新闻,1:公司动态
     * @param type
     * @param page
     * @param rows
     * @return
     */
    @ResponseBody
    @RequestMapping("/list")
    public String getAll(Integer type, Integer page, Integer rows){
        page = page == null ? 0 : page - 1;
        rows = rows == null ? 10 : rows;
        Map<Object, Object> map = new HashMap<>();
        map.put("type", type);
        map.put("firstResult",page * rows);
        map.put("maxResult",rows);
        List<News> list = newsService.selectPaging(map);
        Integer count = newsService.selectCount(map);
        List<News> resultList= new LinkedList<>();
        for (News news : list) {
            News news1 = new News();
            news1.setId(news.getId());
            news1.setImgLink(news.getImgLink());
            news1.setTitle(news.getTitle());
            news1.setDescribe(news.getDescribe());
            news1.setUpdateTime(news.getUpdateTime());
            resultList.add(news1);
        }
        Map<Object,Object> data = new HashMap<>();
        data.put("data", resultList);
        data.put("count", count);
        return Result.toResult(ResultCode.SUCCESS, data);
    }

    /**
     * 显示新闻详情
     */
    @ResponseBody
    @RequestMapping("/details")
    public String getDetails(Integer id){
        if (id == null || "".equals(id)){
            return Result.toResult(ResultCode.PARAM_TYPE_BIND_ERROQ);
        }
        News news = newsService.selectByPrimaryKey(id);

        return Result.toResult(ResultCode.SUCCESS,news);
    }
}
