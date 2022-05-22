package by.itAcademy.myLibrary.controller.command.impl;

import java.util.ArrayList;
import java.util.List;

import by.itAcademy.myLibrary.controller.command.Command;
import by.itAcademy.myLibrary.entity.Book;
import by.itAcademy.myLibrary.service.BookService;
import by.itAcademy.myLibrary.service.ServiceProvider;
import by.itAcademy.myLibrary.service.exception.ServiceException;

public class FindByAuthor implements Command {

	@Override
	public String execute(String request, String author) {
		String response = "";
		ServiceProvider provider = ServiceProvider.getInstance();
		BookService servise = provider.getBookService();
		
		try {
			List <Book> arrayByAuthor = new ArrayList<>();
			arrayByAuthor = servise.findByAuthor(author);
			if (arrayByAuthor == null) {
				response = "There aren't author's books";
			} else {
				for (Book book : arrayByAuthor) {
					response = response + book.toString() + '\n';
					}
			}
		} catch (ServiceException e) {
			//log exception
			response = "Error";
		} 
		
		return response;
	}

	@Override
	public String execute(String request, Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String execute(String request, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
