package com.framework.book.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {
	
	List<Map<String, Object>> selectBookList();
}
