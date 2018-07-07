package com.len.controller;

import com.len.model.BlogArticle;
import com.len.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 文章管理（后台）
 *
 * @author JamesZBL
 * @email 1146556298@qq.com
 * @date 2018-05-05
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService service;

    @GetMapping("/articleList")
    public String articleListPage() {
        return "articleList";
    }

    /**
     * 文章列表
     */
    @ResponseBody
    @GetMapping("/showArticleList")
    public String showArticles(BlogArticle article, String page, String limit) {
        return service.show(article, Integer.valueOf(page), Integer.valueOf(limit));
    }
}
