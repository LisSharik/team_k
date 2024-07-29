package com.riwi.springboot_filter_teams.infrastructure.services.abstract_services;

import com.riwi.springboot_filter_teams.api.dto.request.CouponRequest;
import com.riwi.springboot_filter_teams.api.dto.response.CouponResponse;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.CouponBasicResponse;
import com.riwi.springboot_filter_teams.infrastructure.services.abstract_services.basic_abstract_services.IBasicCrudService;

public interface ICouponService extends IBasicCrudService<CouponRequest, CouponResponse, CouponBasicResponse, Long> {
    
}
