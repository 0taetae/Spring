package com.ssafy.exam.service;

import java.util.List;

import com.ssafy.exam.dto.ProductDto;

public interface ProductService {
	public List<ProductDto> getAllResources(); // admin 계정으로 전체보기

	public List<ProductDto> getUserResources(String userId); // 개인계정으로 본인꺼 보기
	
	public void makeProduct(ProductDto productDto);
	void deleteProduct(List<String> productIds);  // 다중 삭제를 위해 List를 넘김
}
