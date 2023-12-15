package com.abdabughazaleh.pos.pos.controller;

import com.abdabughazaleh.pos.pos.dao.SaleDao;
import com.abdabughazaleh.pos.pos.entity.SaleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/sales")
@RestController
public class SalesController {
    @Autowired
    private SaleDao saleDao;


    @GetMapping(path = "/get-sales")
    public List<SaleEntity> getSales() {
        return this.saleDao.getSales();
    }
    @GetMapping(path = "/get-by-order-id")
    public List<SaleEntity> getSaleByOrderId(@RequestParam  Integer orderId) {
        return this.saleDao.getSaleByOrderId(orderId);
    }
}
