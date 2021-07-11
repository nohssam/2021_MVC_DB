package com.ict.service;

import java.util.List;

import com.ict.vo.VO;

public interface MyService {
	List<VO> getList() throws Exception;
	int getInsert(VO vo) throws Exception;
}
