package com.riwi.springboot_filter_teams.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.springboot_filter_teams.domain.entities.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
