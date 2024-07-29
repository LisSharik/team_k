package com.riwi.springboot_filter_teams.api.dto.response;

import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.CouponBasicResponse;
import com.riwi.springboot_filter_teams.api.dto.response.basics_responses.SaleBasicResponse;

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
public class CouponResponse extends CouponBasicResponse {
    private SaleBasicResponse sale;
}
