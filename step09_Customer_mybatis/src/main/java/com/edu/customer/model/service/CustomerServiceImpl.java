package com.edu.customer.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.customer.model.Customer;
import com.edu.customer.model.dao.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Transactional
	@Override
	public boolean insertCustomer(Customer customer) {
		return sqlSession.getMapper(CustomerDao.class).insertCustomer(customer);
	}
	
	@Transactional
	@Override
	public List<Customer> listCustomer() {
		return sqlSession.getMapper(CustomerDao.class).listCustomer();
	}
	
	@Transactional
	@Override
	public Customer searchCustomer(String id) {
		return sqlSession.getMapper(CustomerDao.class).searchCustomer(id);
	}

}
