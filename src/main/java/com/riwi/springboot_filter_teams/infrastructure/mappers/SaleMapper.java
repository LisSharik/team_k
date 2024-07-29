package com.riwi.springboot_filter_teams.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.springboot_filter_teams.api.dto.request.SaleRequest;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.SaleBasicResponse;
import com.riwi.springboot_filter_teams.domain.entities.Sale;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SaleMapper {
    
    SaleBasicResponse entityToBasicResponse(Sale sale);

    Sale requestToEntity(SaleRequest saleRequest);
}
