package com.nikhil.test;

import com.book.dao.Book;
import com.book.dao.BookDao;
import com.book.dao.BookDaoFactory;

public class ReadTest {
	public static void main(String[] args) {
	BookDao bookDao = 	BookDaoFactory.getInstance();
	Book book = bookDao.getBook(1);
	System.out.println(book.getBookId());
	System.out.println(book.getBookName());
	System.out.println(book.getBookAuthor());
	System.out.println(book.getBookPrice());
	}

}
