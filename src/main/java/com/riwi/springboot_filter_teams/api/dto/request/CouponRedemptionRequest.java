package com.riwi.springboot_filter_teams.api.dto.request;

import java.time.LocalDateTime;

import com.riwi.springboot_filter_teams.domain.entities.Coupon;
import com.riwi.springboot_filter_teams.domain.entities.Sale;
import com.riwi.springboot_filter_teams.domain.entities.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CouponRedemptionRequest {
    private LocalDateTime dadeRedemption;
    private Long couponId;
    private Long userId;
    private Long saleId;
}
