package com.FinalProject.SpringBootAngular.springredditclone.dto;

import com.FinalProject.SpringBootAngular.springredditclone.model.VoteType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoteDto {
    private VoteType voteType;
    private Long postId;
}
