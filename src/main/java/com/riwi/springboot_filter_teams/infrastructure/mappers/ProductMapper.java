package com.riwi.springboot_filter_teams.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.riwi.springboot_filter_teams.api.dto.request.ProductRequest;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.ProductBasicResponse;
import com.riwi.springboot_filter_teams.domain.entities.Product;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {

    ProductBasicResponse entityToBasicResponse(Product product);

    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "items", ignore = true)
    })
    Product requestToEntity(ProductRequest productRequest);
}
