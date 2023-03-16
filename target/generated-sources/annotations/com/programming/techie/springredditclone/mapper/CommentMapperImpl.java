package com.programming.techie.springredditclone.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

import com.FinalProject.techie.springredditclone.dto.CommentsDto;
import com.FinalProject.techie.springredditclone.mapper.CommentMapper;
import com.FinalProject.techie.springredditclone.model.Comment;
import com.FinalProject.techie.springredditclone.model.Post;
import com.FinalProject.techie.springredditclone.model.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-16T00:55:54+0800",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230213-1046, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public Comment map(CommentsDto commentsDto, Post post, User user) {
        if ( commentsDto == null && post == null && user == null ) {
            return null;
        }

        Comment comment = new Comment();

        if ( commentsDto != null ) {
            comment.setText( commentsDto.getText() );
        }
        comment.setPost( post );
        comment.setUser( user );
        comment.setCreatedDate( java.time.Instant.now() );

        return comment;
    }

    @Override
    public CommentsDto mapToDto(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentsDto commentsDto = new CommentsDto();

        commentsDto.setCreatedDate( comment.getCreatedDate() );
        commentsDto.setId( comment.getId() );
        commentsDto.setText( comment.getText() );

        commentsDto.setPostId( comment.getPost().getPostId() );
        commentsDto.setUserName( comment.getUser().getUsername() );

        return commentsDto;
    }
}
