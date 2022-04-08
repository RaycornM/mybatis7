package com.tedu.mapper;

import java.util.List;

import com.tedu.pojo.TbBook;

public interface TbBookMapper {
	//��������isbn��ѯ�����鼮
	public TbBook selectBookByIsbn(String isbn);
	//��ѯ�����е�book
	public List<TbBook> selectAllBook();
	//�����µ��鼮
	public int insertBook(TbBook book);
	//�޸��鼮
	public int updateBook(TbBook book);
	
	
}
