package com.example.simpleapp.article.controller;

import com.example.simpleapp.article.entity.Article;
import com.example.simpleapp.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/getList")
    @ResponseBody
    public List<Article> getList() {
        return articleService.getList();
    }

}
