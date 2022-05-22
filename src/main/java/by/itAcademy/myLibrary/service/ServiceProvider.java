package by.itAcademy.myLibrary.service;

import by.itAcademy.myLibrary.service.impl.BookServiceImpl;
import by.itAcademy.myLibrary.service.impl.StatusBookServiceImpl;

public class ServiceProvider {
	private static ServiceProvider instance ;

	private BookService bookService = new BookServiceImpl();
	private StatusBookService statusBookService = new StatusBookServiceImpl();

	private ServiceProvider() {
	}

	public BookService getBookService() {
		return bookService;
	}

	public StatusBookService getStatusBookService() {
		return statusBookService;
	}

	public static ServiceProvider getInstance() {
		if (instance == null) {
			instance = new ServiceProvider();
		}
		return instance;
	}

}
