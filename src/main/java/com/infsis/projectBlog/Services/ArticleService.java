package com.infsis.projectBlog.Services;

import com.infsis.projectBlog.DTOs.ArticleDTO;

import java.util.Optional;

public interface ArticleService {
    Optional<ArticleDTO> ArticleById (Integer ArticleId);
    ArticleDTO saveArticle(ArticleDTO articleDTO);
    ArticleDTO updateArticle(Integer articleId, ArticleDTO articleDTO);
    void deleteArticle(Integer articleId);
}
