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
public class CouponRedemtionBasicResponse {
    private Long id;
    private LocalDateTime dateRedemtion;

}
