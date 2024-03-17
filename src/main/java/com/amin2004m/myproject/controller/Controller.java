package com.amin2004m.myproject.controller;

import com.amin2004m.myproject.entities.Blog;
import com.amin2004m.myproject.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private BlogService blogService;

    @GetMapping("/select")
    public List<Blog> selectBlogs() {
        return blogService.selectBlogs();
    }

    @GetMapping("/insert")
    public Blog insert(@RequestBody Blog blog) {
        return blogService.insert(blog);
    }

    @DeleteMapping("/delete")
    public void delete(@PathVariable Long id) {
        blogService.delete(id);
    }

    @PutMapping("/update")
    public Blog update(@PathVariable Long id, Blog blog) {
        blog.setId(id);
        return blogService.update(blog);
    }
}
