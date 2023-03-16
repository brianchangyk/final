package com.programming.techie.springredditclone.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

import com.FinalProject.techie.springredditclone.dto.SubredditDto;
import com.FinalProject.techie.springredditclone.mapper.SubredditMapper;
import com.FinalProject.techie.springredditclone.model.Subreddit;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-16T00:55:58+0800",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 3.33.0.v20230213-1046, environment: Java 17.0.6 (Eclipse Adoptium)"
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
