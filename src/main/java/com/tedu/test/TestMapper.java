package com.tedu.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.tedu.mapper.TbBookMapper;
import com.tedu.pojo.TbBook;

public class TestMapper extends SuperTestMapper{
	@Test
	public void Test1() {
		TbBookMapper mapper = session.getMapper(TbBookMapper.class);
		TbBook book = mapper.selectBookByIsbn("9787111213826");
		System.out.println(book);
	}
	
	@Test
	public void Test2() {
		TbBookMapper mapper = session.getMapper(TbBookMapper.class);
		List<TbBook> list = mapper.selectAllBook();
		for(TbBook book : list) {
			System.out.println(book);
		}
	}
}

