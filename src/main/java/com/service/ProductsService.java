package com.service;

import java.util.List;

import com.model.Products;

public interface ProductsService {
	public List<Products> getAllProducts();
	public Products getProduct(int pid);
	public boolean updateProduct(int pid, String bn, String gd, int sz, int pr);
	public boolean addProduct(Products product);
}
