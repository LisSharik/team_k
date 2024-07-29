package com.riwi.springboot_filter_teams.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riwi.springboot_filter_teams.api.dto.request.CouponRedemptionRequest;
import com.riwi.springboot_filter_teams.api.dto.response.CouponRedemptionResponse;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.CouponRedemtionBasicResponse;
import com.riwi.springboot_filter_teams.domain.entities.CouponRedemption;
import com.riwi.springboot_filter_teams.domain.repositories.CouponRedemptionRepository;
import com.riwi.springboot_filter_teams.infrastructure.mappers.CouponMapper;
import com.riwi.springboot_filter_teams.infrastructure.mappers.CouponRedemptionMapper;
import com.riwi.springboot_filter_teams.infrastructure.services.abstract_services.ICouponRedemption;
import com.riwi.springboot_filter_teams.util.exceptions.IdNotFoundException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CouponRedemptionService implements ICouponRedemption {

    @Autowired
    private final CouponRedemptionRepository couponRedemptionRepository;

    @Autowired
    private final CouponRedemptionMapper couponRedemptionMapper;


    @Override
    public CouponRedemtionBasicResponse create(CouponRedemptionRequest rq) {
        // CouponRedemption couponRedemption = this.couponRedemptionMapper.requestToEntity(rq);

        // return this.couponRedemptionMapper.entityToBasicResponse(this.couponRedemptionRepository.save(couponRedemption));

        throw new UnsupportedOperationException("Unimplemented method 'create'");


    }

    @Override
    public CouponRedemptionResponse getById(Long id) {
        // CouponRedemption couponRedemption = this.couponRedemptionRepository.findById(id).orElseThrow(()->new IdNotFoundException("CouponRedemption"));

        // return this.couponRedemptionMapper.(couponRedemption);
        throw new UnsupportedOperationException("Unimplemented method 'create'");


    }

}
