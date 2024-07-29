package com.riwi.springboot_filter_teams.infrastructure.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riwi.springboot_filter_teams.api.dto.request.CouponRequest;
import com.riwi.springboot_filter_teams.api.dto.response.CouponResponse;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.CouponBasicResponse;
import com.riwi.springboot_filter_teams.domain.repositories.CouponRepository;
import com.riwi.springboot_filter_teams.infrastructure.services.abstract_services.ICouponService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CouponService implements ICouponService {

    @Autowired
    private final CouponRepository couponRepository;

    @Override
    public CouponResponse getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public CouponBasicResponse create(CouponRequest rq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public CouponResponse update(Long id, CouponRequest rq) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
