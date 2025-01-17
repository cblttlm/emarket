package com.emarket.emarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emarket.emarket.entity.OrderEntity;
import com.emarket.emarket.repository.OrderRepository;


@Service
public class OrderBusiness implements OrderService{
	@Autowired
	private OrderRepository orderRepository;
	 /**
     * @Title: saveOrderEntity
     * <p>Description: save order information
     * </p>
     * @param order
     * @return
     * @author: chenbl
     * @version 1.0
     */
	public void saveOrderEntity(OrderEntity orderEntity) {
		orderRepository.saveAndFlush(orderEntity);
	}
	 /**
     * @Title: getOrderEntityList
     * <p>Description: get order information list by buyid
     * </p>
     * @param
     * @return order information list
     * @author: chenbl
     * @version 1.0
     */
	public List<OrderEntity> getOrderEntityList(Integer buyerid){
	    return orderRepository.getOrderEntityList(buyerid);
	}


}
