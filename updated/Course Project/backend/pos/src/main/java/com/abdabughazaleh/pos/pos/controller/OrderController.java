package com.abdabughazaleh.pos.pos.controller;

import com.abdabughazaleh.pos.pos.dao.OrderDao;
import com.abdabughazaleh.pos.pos.dao.SaleDao;
import com.abdabughazaleh.pos.pos.dto.OrderDto;
import com.abdabughazaleh.pos.pos.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private SaleDao saleDao;


    @PostMapping(path = "/save-order")
    public OrderEntity saveOrder(@RequestBody List<OrderDto> order) {
        return this.saleDao.saveSale(order);
    }

    @GetMapping(path = "/get-orders")
    public List<OrderEntity> getAllOrders(){
        return this.orderDao.getAllOrders();
    }
}
