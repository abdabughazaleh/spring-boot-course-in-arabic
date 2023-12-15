package com.abdabughazaleh.pos.pos.dao;

import com.abdabughazaleh.pos.pos.dto.OrderDto;
import com.abdabughazaleh.pos.pos.entity.OrderEntity;
import com.abdabughazaleh.pos.pos.entity.SaleEntity;
import com.abdabughazaleh.pos.pos.repository.SaleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleDao {

    @Autowired
    private SaleRepo saleRepo;

    private OrderDao orderDao;

    public SaleDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public OrderEntity saveSale(List<OrderDto> order) {

        if (order.size() == 0)
            return null;
        OrderEntity ord = this.orderDao.saveOrder(order);
        order.forEach(o -> {
            SaleEntity sale = new SaleEntity();
            sale.setOrderId(ord.getOrderId());
            sale.setProductId(o.getProductId());
            this.saleRepo.save(sale);
        });

        return ord;
    }


    public List<SaleEntity> getSales() {
        return this.saleRepo.findAll();
    }

    public List<SaleEntity> getSaleByOrderId(Integer orderId) {
        return this.saleRepo.findAllByOrderId(orderId);
    }


}
