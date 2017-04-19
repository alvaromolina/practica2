package com.ucbcba.taller.controllers;

import com.ucbcba.taller.entities.Article;
import com.ucbcba.taller.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by alvaro on 19/4/17.
 */
public class ArticleController {


    private ArticleService articleService;

    @Autowired
    public void setArticleService(ArticleService articleService) {
        this.articleService = articleService;
    }

    /**
     * List all articles.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("articles", articleService.listAllArticles());
        return "articles";
    }


    @RequestMapping(value = "/article/{id}", method = RequestMethod.GET)
    public String showArticle(@PathVariable Integer id, Model model) {
        model.addAttribute("article", articleService.getArticleById(id));
        return "article";
    }


    @RequestMapping(value = "/article/delete/{id}", method = RequestMethod.GET)
    public String deleteArticle(@PathVariable Integer id, Model model) {
        articleService.deleteArticle(id);
        return "articles";
    }

    @RequestMapping(value = "/article/new", method = RequestMethod.GET)
    public String newArticle(Model model) {
        model.addAttribute("article", new Article());
        return "articleForm";
    }

    @RequestMapping("article/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("article", articleService.getArticleById(id));
        return "articleForm";
    }

    @RequestMapping(value = "article", method = RequestMethod.POST)
    public String saveArticle(@Valid Article article, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "articleForm";
        }

        articleService.saveArticle(article);
        return "redirect:/article/" + article.getId();
    }

}
