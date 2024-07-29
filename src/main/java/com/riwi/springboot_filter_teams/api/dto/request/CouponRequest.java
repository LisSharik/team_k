package com.riwi.springboot_filter_teams.api.dto.request;

import java.time.LocalDateTime;
import java.util.List;

import com.riwi.springboot_filter_teams.domain.entities.CouponRedemtion;

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
public class CouponRequest {
    @Schema(description = "Coupon name", example = "30% dto")
    @NotBlank(message = "The Coupon name is required")
    private String name;
    private Long codeUnique;
    private LocalDateTime expirationDate;
    private Boolean available;
    private Double porcent;

    private List<CouponRedemtion> couponRedemptions;
}
