package com.abdabughazaleh.pos.pos.dao;

import com.abdabughazaleh.pos.pos.entity.ProductEntity;
import com.abdabughazaleh.pos.pos.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDao {
    @Autowired
    private ProductRepo productRepo;


    public ProductEntity addProduct(ProductEntity product) {
        return this.productRepo.save(product);
    }

    public ProductEntity updateProduct(ProductEntity product) {
        return this.productRepo.save(product);
    }

    public void deleteProduct(Integer productId) {
        this.productRepo.deleteById(productId);
    }

    public ProductEntity getProductByBarcode(String barcode) {
        Optional<ProductEntity> o = Optional.ofNullable(this.productRepo.findByBarcode(barcode));
        return o.isPresent() ? o.get() : null;
    }
    public ProductEntity getProductById(Integer productId) {
        Optional<ProductEntity> o = this.productRepo.findById(productId);
        return o.isPresent() ? o.get() : null;
    }
    public List<ProductEntity> getAllProducts() {
        return this.productRepo.findAll();
    }
}
