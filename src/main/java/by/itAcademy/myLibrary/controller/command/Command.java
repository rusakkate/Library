package by.itAcademy.myLibrary.controller.command;

import by.itAcademy.myLibrary.entity.Book;

public interface Command {
	public String execute (String request, Book book);
	public String execute (String request, String author);
	public String execute (String request, int id);
}
