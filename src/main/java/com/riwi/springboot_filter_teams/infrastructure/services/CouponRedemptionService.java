package com.riwi.springboot_filter_teams.infrastructure.services;

import org.springframework.stereotype.Service;

import com.riwi.springboot_filter_teams.api.dto.request.CouponRedemptionRequest;
import com.riwi.springboot_filter_teams.api.dto.response.CouponRedemptionResponse;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.CouponRedemtionBasicResponse;
import com.riwi.springboot_filter_teams.infrastructure.services.abstract_services.ICouponRedemption;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CouponRedemptionService implements ICouponRedemption {
    @Override
    public CouponRedemtionBasicResponse create(CouponRedemptionRequest rq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CouponRedemptionResponse getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

}
