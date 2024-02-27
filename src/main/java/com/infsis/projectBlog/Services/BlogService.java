package com.infsis.projectBlog.Services;

import com.infsis.projectBlog.DTOs.BlogDTO;

import java.util.Optional;

public interface BlogService {
    Optional<BlogDTO> getBlogById(Integer blogId);
    BlogDTO saveBlog(BlogDTO blogDTO);
    BlogDTO updateBlog(Integer blogId, BlogDTO blogDTO);
    void deleteBlog(Integer blogId);
}
