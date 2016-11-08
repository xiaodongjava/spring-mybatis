package com.spring.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mybatis.domain.entity.IndividualAccountRecord;
import com.spring.mybatis.domain.mapper.IndividualAccountRecordMapper;

@Service
public class TestService {
	@Autowired
	private IndividualAccountRecordMapper individualAccountRecordMapper;

	public void select() {
		List<IndividualAccountRecord> list = individualAccountRecordMapper.selectAll();
		System.out.println(list.size());
	}
}
