package org.example.proxy.dynamic.cglib.dao;

import org.example.proxy.dynamic.cglib.dao.impl.BookFacadeImpl;
import org.example.proxy.dynamic.cglib.dao.proxy.BookFacadeCglib;

public class CglibTest {

	public static void main(String[] args) {
		BookFacadeCglib cglib = new BookFacadeCglib();
		BookFacadeImpl bookCglib = (BookFacadeImpl) cglib.getInstance(new BookFacadeImpl());
		bookCglib.addBook();
	}

}
