package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.Article;
import com.ucbcba.taller.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by alvaro on 19/4/17.
 */
public class ArticleServiceImpl  implements ArticleService{


    private ArticleRepository articleRepository;

    @Autowired
    @Qualifier(value = "articleRepository")
    public void setArticleRepository(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Iterable<Article> listAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public Article getArticleById(Integer id) {
        return articleRepository.findOne(id);
    }

    @Override
    public Article saveArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public void deleteArticle(Integer id) {
        articleRepository.delete(id);
    }
}
