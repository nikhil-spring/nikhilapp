package com.nikhil.test;

import com.book.dao.Book;
import com.book.dao.BookDao;
import com.book.dao.BookDaoFactory;

public class Test {

	public static void main(String[] args) {
		BookDao bookDao = BookDaoFactory.getInstance();
		Book book = new Book();
		book.setBookId(2);
		book.setBookName("Java BY nikhil");
		book.setBookAuthor("Nikhil");
		book.setBookPrice(10000);
		bookDao.saveBook(book);
	}

}
