package com.FinalProject.SpringBootAngular.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FinalProject.SpringBootAngular.springredditclone.model.Post;
import com.FinalProject.SpringBootAngular.springredditclone.model.Subreddit;
import com.FinalProject.SpringBootAngular.springredditclone.model.User;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
