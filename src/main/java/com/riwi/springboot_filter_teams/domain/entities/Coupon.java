package com.riwi.springboot_filter_teams.domain.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "coupons")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false)
    private Long codeUnique;

    @Column(nullable = false)
    @FutureOrPresent
    private LocalDateTime expirationDate;

    @Column(nullable = false)
    private Boolean available;

    @Positive
    @Column(nullable = false)
    private Double porcent;

    @OneToMany(fetch = FetchType.EAGER,
     mappedBy = "coupon",
     cascade = CascadeType.ALL,
     orphanRemoval = false)
    private List<CouponRedemption> couponRedemptions;
}
