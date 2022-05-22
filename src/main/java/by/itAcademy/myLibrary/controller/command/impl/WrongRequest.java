package by.itAcademy.myLibrary.controller.command.impl;

import by.itAcademy.myLibrary.controller.command.Command;
import by.itAcademy.myLibrary.entity.Book;

public class WrongRequest implements Command{
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

	@Override
	public String execute(String request, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
