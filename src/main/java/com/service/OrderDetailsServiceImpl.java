package com.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrderDetailsDao;
import com.model.OrderDetails;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService{

	@Autowired
	OrderDetailsDao orderDetailsDao;
	
	@Override
	public List<OrderDetails> getUserOrderDetails(int ordid) {
		return orderDetailsDao.getUserOrderDetails(ordid);
	}

	@Override
	public List<OrderDetails> getPurchaseReport(String rbrand, Date rdate) {
		return orderDetailsDao.getPurchaseReport(rbrand, rdate);
	}

}
