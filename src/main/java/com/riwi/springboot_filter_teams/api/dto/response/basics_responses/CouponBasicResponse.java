package com.riwi.springboot_filter_teams.api.dto.response.basics_responses;

import java.time.LocalDateTime;

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
public class CouponBasicResponse {
    private Long id;
    private String name;
    private Long codeUnique;
    private LocalDateTime expirationDate;
    private Boolean available;
    private Double porcent;

}
