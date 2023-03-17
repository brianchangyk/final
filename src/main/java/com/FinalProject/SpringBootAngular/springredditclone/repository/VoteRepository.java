package com.FinalProject.SpringBootAngular.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FinalProject.SpringBootAngular.springredditclone.model.Post;
import com.FinalProject.SpringBootAngular.springredditclone.model.User;
import com.FinalProject.SpringBootAngular.springredditclone.model.Vote;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
