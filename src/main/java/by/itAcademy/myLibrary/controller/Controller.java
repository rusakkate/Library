package by.itAcademy.myLibrary.controller;

import by.itAcademy.myLibrary.controller.command.Command;
import by.itAcademy.myLibrary.entity.Book;
import by.itAcademy.myLibrary.service.exception.ServiceException;

public class Controller {
	public final CommandProvider provider = new CommandProvider();
	private final char delimeter = ' ';
	String commandName;
	Command executionCommand = null;
	
	public String excecuteTask (String request, Book book) {
		commandName = request.substring(0, request.indexOf(delimeter));
		try {
			executionCommand = provider.getCommand(commandName);
		} catch (ServiceException e) {
			// log exception
			System.out.println("File don't find");
		}
		
		String response;
		response = executionCommand.execute(request, book);
		System.out.println(response);
		return response;
	}
	
	public String excecuteTask (String request, String author) {
		commandName = request.substring(0, request.indexOf(delimeter));
		try {
			executionCommand = provider.getCommand(commandName);
		} catch (ServiceException e) {
			// log exception
			System.out.println("File don't find");
		}
		
		String response;
		response = executionCommand.execute(request, author);
		System.out.println(response);
		return response;
	}
	
	public String excecuteTask (String request, int id) {
		commandName = request.substring(0, request.indexOf(delimeter));
		try {
			executionCommand = provider.getCommand(commandName);
		} catch (ServiceException e) {
			// log exception
			System.out.println("File don't find");
		}
		
		String response;
		response = executionCommand.execute(request, id);
		System.out.println(response);
		return response;
	}


}
  