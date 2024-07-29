package com.riwi.springboot_filter_teams.api.dto.response;

import java.util.List;

import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.CouponRedemtionBasicResponse;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.SaleBasicResponse;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.UserBasicResponse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class UserResponse extends UserBasicResponse {
    private List<SaleBasicResponse> sales;
    private List<CouponRedemtionBasicResponse> couponRedemptions;
}
