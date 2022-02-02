package com.pluralsight.blog.data;

import java.util.List;

import com.pluralsight.blog.model.Category;
import com.pluralsight.blog.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

        List<Post> findByCategory(Category category);
}

