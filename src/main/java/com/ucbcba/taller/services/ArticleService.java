package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.Article;

/**
 * Created by alvaro on 19/4/17.
 */
public interface ArticleService {

    Iterable<Article> listAllArticles();

    Article getArticleById(Integer id);

    Article saveArticle(Article article);

    void deleteArticle(Integer id);
}
