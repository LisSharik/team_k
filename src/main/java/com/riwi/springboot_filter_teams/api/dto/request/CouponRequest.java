package com.riwi.springboot_filter_teams.api.dto.request;

import java.time.LocalDateTime;
import java.util.List;

import com.riwi.springboot_filter_teams.domain.entities.CouponRedemtion;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotNull(message = "The Coupon code unique is required")
    private Long codeUnique;

    @Schema(description = "Coupon expiration date")
    @NotNull(message = "The Coupon expiration date is required")
    private LocalDateTime expirationDate;

    @Schema(description = "Coupon available")
    @NotNull(message = "The Coupon available date is required")
    private Boolean available;

    @Schema(description = "Coupon percent")
    @NotNull(message = "The Coupon percent is required")
    private Double porcent;

    
}
