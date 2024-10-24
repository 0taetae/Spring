package com.edu.customer.model.dao;

import java.util.List;

import com.edu.customer.model.Customer;

// 고객 등록, 고객 리스트, 고객 검색
public interface CustomerDao {
	public boolean insertCustomer(Customer customer);  // 고객 등록
	public List<Customer> listCustomer();  // 고객 리스트
	public Customer searchCustomer(String id);  // 고객 검색
}
