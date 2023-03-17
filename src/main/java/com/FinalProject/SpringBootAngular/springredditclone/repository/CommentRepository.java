package com.FinalProject.SpringBootAngular.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FinalProject.SpringBootAngular.springredditclone.model.Comment;
import com.FinalProject.SpringBootAngular.springredditclone.model.Post;
import com.FinalProject.SpringBootAngular.springredditclone.model.User;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
