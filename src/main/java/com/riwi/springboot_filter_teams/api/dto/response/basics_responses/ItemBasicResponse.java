package com.riwi.springboot_filter_teams.api.dto.response.basics_responses;

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
public class ItemBasicResponse {
    private Long id;
    private int quantity;
    private double price;
    
}
