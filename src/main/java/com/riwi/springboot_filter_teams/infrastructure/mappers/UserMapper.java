package com.riwi.springboot_filter_teams.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

import com.riwi.springboot_filter_teams.api.dto.request.UserRequest;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.UserBasicResponse;
import com.riwi.springboot_filter_teams.domain.entities.User;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    
    UserBasicResponse entityToBasicResponse(User user);

    @Mappings({
        @Mapping(target = "id", ignore = true),
        @Mapping(target = "sales", ignore = true),
        @Mapping(target = "couponRedemptions", ignore = true)
    })
    User requestToEntity(UserRequest userRequest);
}
