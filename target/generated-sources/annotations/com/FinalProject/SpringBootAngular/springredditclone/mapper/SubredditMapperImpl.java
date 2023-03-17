package com.FinalProject.SpringBootAngular.springredditclone.mapper;

import com.FinalProject.SpringBootAngular.springredditclone.dto.SubredditDto;
import com.FinalProject.SpringBootAngular.springredditclone.model.Subreddit;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-17T13:12:33+0800",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230218-1114, environment: Java 17.0.6 (Eclipse Adoptium)"
)
@Component
public class SubredditMapperImpl implements SubredditMapper {

    @Override
    public SubredditDto mapSubredditToDto(Subreddit subreddit) {
        if ( subreddit == null ) {
            return null;
        }

        SubredditDto.SubredditDtoBuilder subredditDto = SubredditDto.builder();

        subredditDto.description( subreddit.getDescription() );
        subredditDto.id( subreddit.getId() );
        subredditDto.name( subreddit.getName() );

        subredditDto.numberOfPosts( mapPosts(subreddit.getPosts()) );

        return subredditDto.build();
    }

    @Override
    public Subreddit mapDtoToSubreddit(SubredditDto subredditDto) {
        if ( subredditDto == null ) {
            return null;
        }

        Subreddit.SubredditBuilder subreddit = Subreddit.builder();

        subreddit.description( subredditDto.getDescription() );
        subreddit.id( subredditDto.getId() );
        subreddit.name( subredditDto.getName() );

        return subreddit.build();
    }
}
