package com.book.dao;

public interface BookDao {
	void saveBook(Book book);

	Book getBook(int bookId);

}
