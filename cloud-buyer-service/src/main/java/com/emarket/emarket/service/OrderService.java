package com.emarket.emarket.service;

import java.util.List;

import com.emarket.emarket.entity.OrderEntity;

public interface OrderService {


	 /**
     * @Title: getOrderEntityList
     * <p>Description: get order information list by buyid
     * </p>
     * @param
     * @return order information list
     * @author: chenbl
     * @version 1.0
     */
	public List<OrderEntity> getOrderEntityList(Integer buyerid);

	 /**
     * @Title: saveOrderEntity
     * <p>Description: save order information
     * </p>
     * @param order
     * @return
     * @author: chenbl
     * @version 1.0
     */
	public void saveOrderEntity(OrderEntity orderEntity);


}