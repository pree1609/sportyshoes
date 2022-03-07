package com.service;

import java.util.Date;
import java.util.List;

import com.model.OrderDetails;

public interface OrderDetailsService {
	public List<OrderDetails> getUserOrderDetails(int ordid);
	public List<OrderDetails> getPurchaseReport(String rbrand, Date rdate);
}
