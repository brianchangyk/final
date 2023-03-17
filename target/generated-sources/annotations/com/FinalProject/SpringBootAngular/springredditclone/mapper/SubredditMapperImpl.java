package com.FinalProject.SpringBootAngular.springredditclone.mapper;

import com.FinalProject.SpringBootAngular.springredditclone.dto.SubredditDto;
import com.FinalProject.SpringBootAngular.springredditclone.model.Subreddit;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-17T16:15:46+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@Component
public class SubredditMapperImpl implements SubredditMapper {

    @Override
    public SubredditDto mapSubredditToDto(Subreddit subreddit) {
        if ( subreddit == null ) {
            return null;
        }

        SubredditDto.SubredditDtoBuilder subredditDto = SubredditDto.builder();

        subredditDto.id( subreddit.getId() );
        subredditDto.name( subreddit.getName() );
        subredditDto.description( subreddit.getDescription() );

        subredditDto.numberOfPosts( mapPosts(subreddit.getPosts()) );

        return subredditDto.build();
    }

    @Override
    public Subreddit mapDtoToSubreddit(SubredditDto subredditDto) {
        if ( subredditDto == null ) {
            return null;
        }

        Subreddit.SubredditBuilder subreddit = Subreddit.builder();

        subreddit.id( subredditDto.getId() );
        subreddit.name( subredditDto.getName() );
        subreddit.description( subredditDto.getDescription() );

        return subreddit.build();
    }
}
