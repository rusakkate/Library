package by.itAcademy.myLibrary.controller.command.impl;

import by.itAcademy.myLibrary.controller.command.Command;
import by.itAcademy.myLibrary.entity.Book;
import by.itAcademy.myLibrary.service.BookService;
import by.itAcademy.myLibrary.service.ServiceProvider;
import by.itAcademy.myLibrary.service.exception.ServiceException;

public class FindById implements Command {

	@Override
	public String execute(String request, int id) {
		String response = null;
		ServiceProvider provider = ServiceProvider.getInstance();
		BookService servise = provider.getBookService();
		try {
			response = servise.findById(id).toString();
		} catch (ServiceException e) {
			// log exception
			response = "Exception";
		}
		return response;
	}
	
	@Override
	public String execute(String request, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String execute(String request, String author) {
		// TODO Auto-generated method stub
		return null;
	}



}
