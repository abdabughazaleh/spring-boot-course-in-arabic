package com.abdabughazaleh.pos.pos.repository;

import com.abdabughazaleh.pos.pos.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
    ProductEntity findByBarcode(String barcode);
}
