package org.lanqiao.dao;

import java.util.List;

import org.lanqiao.entity.OrderInfo;

public interface OrderInfoDao {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
    
    List<OrderInfo> selectOrders();
}