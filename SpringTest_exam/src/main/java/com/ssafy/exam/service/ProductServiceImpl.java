package com.ssafy.exam.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ssafy.exam.dto.ProductDto;
import com.ssafy.exam.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService{

	private final ProductMapper productMapper;
	
	public ProductServiceImpl(ProductMapper productMapper) {
		super();
		this.productMapper = productMapper;
	}
	
	@Override
	public List<ProductDto> getAllResources() {
		return productMapper.getAllResources();
	}

	@Override
	public List<ProductDto> getUserResources(String userId) {
		return productMapper.getUserResources(userId);
		                     
	}

	@Override
	public void makeProduct(ProductDto productDto) {
		productMapper.makeProduct(productDto);
	}

	@Override
	public void deleteProduct(List<String> productIds) {
		productMapper.deleteProduct(productIds);
	}

	@Override
	public List<ProductDto> searchByDate(Map<String, Object> map) {
		return productMapper.searchByDate(map);
	}

	@Override
	public List<ProductDto> searchByDateAdmin(String regist_date) {
		return productMapper.searchByDateAdmin(regist_date);
	}

	@Override
	public ProductDto getDetail(String productId) {
		return productMapper.getDetail(productId);
	}

}
