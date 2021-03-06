package com.ict.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.vo.VO;

@Repository("myDAOImpl")
public class MyDAOImpl implements MyDAO{
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<VO> getList() throws Exception{
		return sqlSessionTemplate.selectList("list");
	}
	@Override
	public int getInsert(VO vo) {
		return sqlSessionTemplate.insert("insert", vo);
	}
}
