package com.example.method_security.repository;

import com.example.method_security.model.Post;
import com.example.method_security.model.Status;
import com.example.method_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByAuthor(User author);
    List<Post> findByIsPublicTrue();
    List<Post> findByStatus(Status status);
}
