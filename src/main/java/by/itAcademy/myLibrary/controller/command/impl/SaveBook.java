package by.itAcademy.myLibrary.controller.command.impl;

import by.itAcademy.myLibrary.controller.command.Command;
import by.itAcademy.myLibrary.entity.Book;
import by.itAcademy.myLibrary.service.BookService;
import by.itAcademy.myLibrary.service.ServiceProvider;
import by.itAcademy.myLibrary.service.exception.ServiceException;


public class SaveBook implements Command {
	@Override
	public String execute(String request, Book book) {
		String response = null;
		ServiceProvider provider = ServiceProvider.getInstance();
		BookService servise = provider.getBookService();
		
		try {
			servise.save(book);
			response = "Book has been saved";
		} catch (ServiceException e) {
			// log exception
			response = "Error, book hasn't been saved";
		} 
		
		return response;
	}

	@Override
	public String execute(String request, String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String execute(String request, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
