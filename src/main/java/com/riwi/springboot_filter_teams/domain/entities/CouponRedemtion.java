package com.riwi.springboot_filter_teams.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "cupon_redemtions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CouponRedemtion {

    private Long id;
    private LocalDateTime dateRedemtion;
}
