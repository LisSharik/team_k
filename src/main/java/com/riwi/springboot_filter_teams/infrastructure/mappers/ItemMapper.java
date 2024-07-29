package com.riwi.springboot_filter_teams.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.springboot_filter_teams.api.dto.request.ItemRequest;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.ItemBasicResponse;
import com.riwi.springboot_filter_teams.domain.entities.Item;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ItemMapper {
    
    ItemBasicResponse entityToBasicResponse(Item item);

    //Item requestToEntity(ItemRequest itemRequest);
}
