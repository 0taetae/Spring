package com.edu.customer.model.service;

import java.util.List;

import com.edu.customer.model.Customer;

public interface CustomerService {
	public boolean insertCustomer(Customer customer);  // 고객 등록
	public List<Customer> listCustomer();  // 고객 리스트
	public Customer searchCustomer(String id);  // 고객 검색
}
