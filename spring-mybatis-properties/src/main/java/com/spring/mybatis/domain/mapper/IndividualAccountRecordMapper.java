package com.spring.mybatis.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mybatis.domain.entity.IndividualAccountRecord;

@Mapper
public interface IndividualAccountRecordMapper {

	/**
	 * 查询所有
	 * 
	 * @date 2016年10月10日
	 * @param individualAccountRecord
	 * @return
	 */
	public List<IndividualAccountRecord> selectAll();

}
