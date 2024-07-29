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

    @Schema(description = "Coupon code unique")
    @NotBlank(message = "The Coupon code unique is required")
    private Long codeUnique;

    @Schema(description = "Coupon expiration date")
    @NotBlank(message = "The Coupon expiration date is required")
    private LocalDateTime expirationDate;

    @Schema(description = "Coupon available")
    @NotBlank(message = "The Coupon available date is required")
    private Boolean available;

    @Schema(description = "Coupon percent")
    @NotBlank(message = "The Coupon percent is required")
    private Double porcent;

    
}
