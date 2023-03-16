package com.FinalProject.SpringBootAngular.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FinalProject.SpringBootAngular.springredditclone.model.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}
