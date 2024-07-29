package com.riwi.springboot_filter_teams.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(length = 255, nullable = false)
    private String name;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(length = 255, nullable = false)
    private String email;
    
    @Column(length = 255, nullable = false)
    private String phone;

    @OneToMany(fetch = FetchType.EAGER,
     mappedBy = "user",
     cascade = CascadeType.ALL,
     orphanRemoval = false)
    private List<Sale> sales;

    @OneToMany(fetch = FetchType.EAGER,
     mappedBy = "user",
     cascade = CascadeType.ALL,
     orphanRemoval = false)
    private List<CouponRedemption> couponRedemptions;
}
