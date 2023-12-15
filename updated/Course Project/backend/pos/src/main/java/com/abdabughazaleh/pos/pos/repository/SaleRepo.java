package com.abdabughazaleh.pos.pos.repository;

import com.abdabughazaleh.pos.pos.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepo extends JpaRepository<SaleEntity, Integer> {

    List<SaleEntity> findAllByOrderId(Integer orderId);
}
