package com.riwi.springboot_filter_teams.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.springboot_filter_teams.api.dto.request.CouponRequest;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.CouponRedemtionBasicResponse;
import com.riwi.springboot_filter_teams.domain.entities.CouponRedemption;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CouponRedemptionMapper {
    
    CouponRedemtionBasicResponse entityToBasicResponse(CouponRedemption couponRedemption);

    CouponRedemption requestToEntity(CouponRequest couponRequest);
    
}
