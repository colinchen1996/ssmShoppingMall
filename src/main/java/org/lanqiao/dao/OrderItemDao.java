package org.lanqiao.dao;

import org.lanqiao.entity.OrderItem;

public interface OrderItemDao {
    int insert(OrderItem record);

    int insertSelective(OrderItem record);
}