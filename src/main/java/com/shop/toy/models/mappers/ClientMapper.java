package com.shop.toy.models.mappers;

import com.shop.toy.models.dto.ClientDto;
import com.shop.toy.models.entity.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {
    ClientMapper CLIENT_MAPPER = Mappers.getMapper(ClientMapper.class);

    Client toClient(ClientDto clientDto);

    @Mapping(target = "user", ignore = true)
    ClientDto toClientDto(Client client);
}
