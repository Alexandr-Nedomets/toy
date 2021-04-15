package com.shop.toy.models.mappers;

import com.shop.toy.models.dto.DeveloperDto;
import com.shop.toy.models.entity.Developer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DeveloperMapper {

    DeveloperMapper DEVELOPER_MAPPER = Mappers.getMapper(DeveloperMapper.class);

    Developer toDeveloper(DeveloperDto developerDto);

    DeveloperDto toDeveloperDto(Developer developer);

}
