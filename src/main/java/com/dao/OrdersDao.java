package com.dao;

import java.util.List;

import com.model.Orders;

public interface OrdersDao {
	public List<Orders> getAllOrders();
	public int placeOrder(String lid);
	public int getUserOrderTotal(int ordid);

}
