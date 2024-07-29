package com.riwi.springboot_filter_teams.api.dto.request;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank(message = "The Redemption product is required")
    private LocalDateTime dateRedemption;

    @Schema(description = "Coupon id product")
    @NotBlank(message = "The coupon id product is required")
    private Long couponId;

    @Schema(description = "user Id product")
    @NotBlank(message = "The user Id product is required")
    private Long userId;

    @Schema(description = "sale id product")
    @NotBlank(message = "The sale id product is required")
    private Long saleId;
}
