package com.zack.test.dao;

import org.springframework.stereotype.Repository;

import com.zack.test.domain.TestDO;

@Repository
public interface ITestDAO {

	public TestDO getById(long id);
}
