package com.riwi.springboot_filter_teams.infrastructure.services.abstract_services;

import com.riwi.springboot_filter_teams.api.dto.request.CouponRedemptionRequest;
import com.riwi.springboot_filter_teams.api.dto.response.CouponRedemptionResponse;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.CouponRedemtionBasicResponse;
import com.riwi.springboot_filter_teams.infrastructure.services.abstract_services.basic_abstract_services.ICreateService;
import com.riwi.springboot_filter_teams.infrastructure.services.abstract_services.basic_abstract_services.IGetByIdService;

public interface ICouponRedemption extends
        ICreateService<CouponRedemptionRequest, CouponRedemtionBasicResponse>,
        IGetByIdService<CouponRedemptionResponse, Long> {

}
