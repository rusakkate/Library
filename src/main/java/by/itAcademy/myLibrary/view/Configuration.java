package by.itAcademy.myLibrary.view;

import java.io.IOException;
import java.text.ParseException;

import by.itAcademy.myLibrary.controller.Controller;
import by.itAcademy.myLibrary.entity.Book;


public class Configuration {
	
	public static void workLibrary () throws IOException, ParseException {
		Menu.StartMenu();
		
		int userChoice = UserEnter.inputInt("", Menu.NUMPOINTSTARTMENU);
		
		Controller controller = new Controller();
		
		switch (userChoice) {
		case 1:
			Book book = new Book();
			book.setId(UserEnter.inputInt("Enter book id"));
			book.setName(UserEnter.inputString("Enter book name"));
			book.setAuthor(UserEnter.inputString("Enter author"));
			book.setYear(UserEnter.inputInt("Enter year"));
			controller.excecuteTask("SAVE ", book);
			Configuration.choiseContinueOrFinishWork();
			break;
		case 2:
			controller.excecuteTask ("DELETE ", UserEnter.inputInt("Enter book id"));
			Configuration.choiseContinueOrFinishWork();
			break;
		case 3:
			controller.excecuteTask ("Findbyauthor ", UserEnter.inputString("Enter author"));
			Configuration.choiseContinueOrFinishWork();
			break;
		case 4:
			controller.excecuteTask ("FINDBYID ", UserEnter.inputInt("Enter book id"));
			Configuration.choiseContinueOrFinishWork();
			break;
			
		}
	}
	
	public static void choiseContinueOrFinishWork () throws IOException, ParseException {
		Menu.ContinueMenu();
		
		int userChoice = UserEnter.inputInt("", Menu.NUMPOINTCONTINUEMENU);
		
		switch (userChoice) {
		case 1:
			Configuration.workLibrary();
			break;
		case 2:
			System.out.println("Good bue");
			break;
		}
	}

}
