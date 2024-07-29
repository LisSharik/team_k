package com.riwi.springboot_filter_teams.api.dto.request;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CouponRedemptionRequest {

    @Schema(description = "Redemption product")
    @NotNull(message = "The Redemption product is required")
    private LocalDateTime dateRedemption;

    @Schema(description = "Coupon id product")
    @NotNull(message = "The coupon id product is required")
    private Long couponId;

    @Schema(description = "user Id product")
    @NotNull(message = "The user Id product is required")
    private Long userId;

    @Schema(description = "sale id product")
    @NotNull(message = "The sale id product is required")
    private Long saleId;
}
