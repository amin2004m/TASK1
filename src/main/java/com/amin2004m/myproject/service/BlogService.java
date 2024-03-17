package com.amin2004m.myproject.service;

import com.amin2004m.myproject.entities.Blog;
import com.amin2004m.myproject.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class BlogService {
    @Autowired
    private BlogRepository blogRepository;

    public List<Blog> selectBlogs() {

        return blogRepository.findAll();
    }

    public Blog insert(Blog blog) {

        return blogRepository.save(blog);
    }

    public void delete(Long id) {

        blogRepository.deleteById(id);
    }

    public Blog update(Blog blog) {

        return blogRepository.save(blog);
    }
}
