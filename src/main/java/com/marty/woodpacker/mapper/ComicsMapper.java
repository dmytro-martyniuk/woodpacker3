package com.marty.woodpacker.mapper;

import com.marty.woodpacker.dto.ComicsDTO;
import com.marty.woodpacker.entity.Comics;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ComicsMapper {

    ComicsMapper comicsMapper = Mappers.getMapper(ComicsMapper.class);

//    @Mapping(source = "id", ignore = true)
    ComicsDTO comicsToComicsDTO(Comics comics);

    Comics comicsDTOToComics(ComicsDTO comicsDTO);
}
