package com.riwi.springboot_filter_teams.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.riwi.springboot_filter_teams.api.dto.request.CouponRequest;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.CouponBasicResponse;
import com.riwi.springboot_filter_teams.domain.entities.Coupon;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CouponMapper {
    
    Coupon requestToEntity(CouponRequest couponRequest);

    CouponBasicResponse entityToBasicResponse(Coupon coupon);
}
