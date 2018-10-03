package com.book.dao;

public class BookDaoFactory {
	public static BookDao getInstance() {
		return new BookDaoImpl();
	}
}
