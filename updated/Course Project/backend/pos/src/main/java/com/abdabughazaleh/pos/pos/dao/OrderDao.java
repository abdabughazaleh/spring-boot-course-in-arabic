package com.abdabughazaleh.pos.pos.dao;

import com.abdabughazaleh.pos.pos.dto.OrderDto;
import com.abdabughazaleh.pos.pos.entity.OrderEntity;
import com.abdabughazaleh.pos.pos.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderDao {

    @Autowired
    private OrderRepo orderRepo;


    public OrderEntity saveOrder(List<OrderDto> order) {
        Double total = 0.0;
        for (OrderDto o : order) {
            total += o.getProductPrice();
        }
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setTotal(total);
        return this.orderRepo.save(orderEntity);
    }

    public List<OrderEntity> getAllOrders() {
        return this.orderRepo.findAll();
    }

}
