package com.ssafy.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssafy.exam.dto.ProductDto;
import com.ssafy.exam.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {

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
}
