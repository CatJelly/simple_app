package com.example.simpleapp.article.repository;

import com.example.simpleapp.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long>{

}
