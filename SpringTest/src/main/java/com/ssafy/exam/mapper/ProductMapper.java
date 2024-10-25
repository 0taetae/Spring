package com.ssafy.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.exam.dto.ProductDto;

@Mapper
public interface ProductMapper {
	public List<ProductDto> getAllResources();  // admin 계정으로 전체보기
	public List<ProductDto> getUserResources(String userId);  // 개인계정으로 본인꺼 보기
	
	public void makeProduct(ProductDto productDto);
	void deleteProduct(List<String> productIds);  // 다중 삭제를 위해 List를 넘김
	
	
}
