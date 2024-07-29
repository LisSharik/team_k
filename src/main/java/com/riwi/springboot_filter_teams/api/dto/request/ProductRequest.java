package com.riwi.springboot_filter_teams.api.dto.request;

import com.riwi.springboot_filter_teams.domain.entities.Sale;

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
public class ProductRequest {
    @Schema(description = "Name of the product", example = "Yuca")
    @NotBlank(message = "The product name is required")
    private String name;

    @Schema(description = "Price of the product", example = "Jairo")
    @NotNull(message = "The product price is required")
    private double price;

    @Schema(description = "SaleId of the product")
    @NotNull(message = "The sale Id is required")
    private Long saleId;
}
