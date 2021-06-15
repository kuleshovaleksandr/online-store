package com.freeit.onlinestore.mapper;

import com.freeit.onlinestore.dto.req.NewVideocardDto;
import com.freeit.onlinestore.entity.Videocard;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class NewVideocardMapper extends AbstractMapper<Videocard, NewVideocardDto>{

    public NewVideocardMapper() {
        super(Videocard.class, NewVideocardDto.class);
    }

    @PostConstruct
    public void setupMapper() {
        mapper.createTypeMap(NewVideocardDto.class, Videocard.class)
                .addMappings(m -> m.skip(Videocard::setId))
                .setPostConverter(toEntityConverter());
    }
}
