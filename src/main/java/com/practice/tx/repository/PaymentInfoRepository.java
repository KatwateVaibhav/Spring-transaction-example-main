package com.practice.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.tx.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String> {
}
