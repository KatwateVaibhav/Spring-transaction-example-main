package com.practice.tx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.tx.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
