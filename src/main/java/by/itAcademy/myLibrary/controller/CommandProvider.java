package by.itAcademy.myLibrary.controller;

import java.util.HashMap;
import java.util.Map;

import by.itAcademy.myLibrary.controller.command.Command;
import by.itAcademy.myLibrary.controller.command.CommandName;
import by.itAcademy.myLibrary.controller.command.impl.Delete;
import by.itAcademy.myLibrary.controller.command.impl.FindByAuthor;
import by.itAcademy.myLibrary.controller.command.impl.FindById;
import by.itAcademy.myLibrary.controller.command.impl.SaveBook;
import by.itAcademy.myLibrary.controller.command.impl.WrongRequest;
import by.itAcademy.myLibrary.service.exception.ServiceException;

public class CommandProvider {
	private final Map <CommandName, Command> repository = new HashMap<>();
	
	CommandProvider () {
		repository.put(CommandName.SAVE, new SaveBook());
		repository.put(CommandName.FINDBYAUTHOR, new FindByAuthor());
		repository.put(CommandName.FINDBYID, new FindById());
		repository.put(CommandName.DELETE, new Delete());
		repository.put(CommandName.WRONGREQUEST, new WrongRequest());
	}
	
	Command getCommand (String name) throws ServiceException {
		CommandName commandName = null;
		Command command = null;
		
		commandName = CommandName.valueOf(name.toUpperCase());
		command = repository.get(commandName);
		
		return command;
	}

}
