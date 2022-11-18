package com.kvlt.dao;

import com.kvlt.model.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailDao {

    int insert(OrderDetail orderDetail);

}
