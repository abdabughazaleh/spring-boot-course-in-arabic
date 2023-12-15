package com.abdabughazaleh.pos.pos.entity;

import jakarta.persistence.*;
import lombok.Data;



@Table(name = "orders")
@Data
@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "total")
    private Double total;


}
