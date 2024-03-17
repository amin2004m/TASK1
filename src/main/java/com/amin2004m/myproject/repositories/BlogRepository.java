package com.amin2004m.myproject.repositories;

import com.amin2004m.myproject.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
}
