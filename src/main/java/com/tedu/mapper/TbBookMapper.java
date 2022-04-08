package com.tedu.mapper;

import java.util.List;

import com.tedu.pojo.TbBook;

public interface TbBookMapper {
	//依据数据isbn查询单个书籍
	public TbBook selectBookByIsbn(String isbn);
	//查询出所有的book
	public List<TbBook> selectAllBook();
	//插入新的书籍
	public int insertBook(TbBook book);
	//修改书籍
	public int updateBook(TbBook book);
	
	
}
