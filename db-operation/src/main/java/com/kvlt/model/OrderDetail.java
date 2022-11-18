package com.kvlt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDetail {

    private Long id;
    private String userId;
    private Long orderId;
    private Long skuId;
    private Date orderTime;

    public OrderDetail(String userId, Long orderId, Long skuId) {
        this.userId = userId;
        this.orderId = orderId;
        this.skuId = skuId;
    }

    public OrderDetail(String userId, Long orderId, Long skuId, Date orderTime) {
        this.userId = userId;
        this.orderId = orderId;
        this.skuId = skuId;
        this.orderTime = orderTime;
    }
}
