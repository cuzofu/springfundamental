package org.example.proxy.dynamic.jdk.dao;

import org.example.proxy.dynamic.jdk.dao.impl.BookFacadeImpl;
import org.example.proxy.dynamic.jdk.dao.proxy.BookFacadeProxy;

public class BookFacadeTest {

	public static void main(String[] args) {
		BookFacadeProxy proxy = new BookFacadeProxy();
		BookFacade bookFacade = (BookFacade) proxy.bind(new BookFacadeImpl());
		bookFacade.addBook();
		bookFacade.deleteBook();
	}

}
