package com.riwi.springboot_filter_teams.api.dto.request;

import java.time.LocalDate;
import java.util.List;

import com.riwi.springboot_filter_teams.domain.entities.Product;
import com.riwi.springboot_filter_teams.domain.entities.User;

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
public class SaleRequest {
    @Schema(description = "Date of sale", example = "DD-MM-AAA")
    @NotBlank(message = "date of sale is required")
    private LocalDate date;

    @Schema(description = "Product of Sale")
    @NotBlank(message = "product of sale is required")
    private List<Product> product;

    @Schema(description = "User of sale")
    @NotBlank(message = "user of sale is required")
    private Long userId;
}
