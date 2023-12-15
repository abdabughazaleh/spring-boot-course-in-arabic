package com.abdabughazaleh.pos.pos.repository;

import com.abdabughazaleh.pos.pos.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity, Integer> {
}
