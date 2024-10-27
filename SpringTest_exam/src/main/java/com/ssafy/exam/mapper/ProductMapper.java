package com.ssafy.exam.mapper;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.exam.dto.ProductDto;

@Mapper
public interface ProductMapper {
	public List<ProductDto> getAllResources();
	public List<ProductDto> getUserResources(String userId);
	public void makeProduct(ProductDto productDto);
	void deleteProduct(List<String> productIds);
	public List<ProductDto> searchByDate(Map<String, Object> map);
	public List<ProductDto> searchByDateAdmin(String regist_date);
	public ProductDto getDetail(String productId);
}
