package com.ssafy.exam.service;

import java.util.List;
import java.util.Map;

import com.ssafy.exam.dto.ProductDto;

public interface ProductService {
	public List<ProductDto> getAllResources();
	public List<ProductDto> getUserResources(String userId);
	public void makeProduct(ProductDto productDto);
	void deleteProduct(List<String> productIds);
	public List<ProductDto> searchByDate(Map<String, Object> map);
	public List<ProductDto> searchByDateAdmin(String regist_date);
	public ProductDto getDetail(String productId);
	void updateProduct(ProductDto productDto);

}
