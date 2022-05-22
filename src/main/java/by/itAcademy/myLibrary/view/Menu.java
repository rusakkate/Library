package by.itAcademy.myLibrary.view;

public class Menu {
public static final int NUMPOINTSTARTMENU = 4;
	
	public static void StartMenu () {
		System.out.print ("Сhoose an action: " + "\n" + 
							"1. Save book " + "\n" + 
							"2. Delete book " + "\n" + 
							"3. Find book by author " + "\n" +
							"4. Find book by id ");
	}
	
	public static final int NUMPOINTCONTINUEMENU = 2;
	
	public static void ContinueMenu () {
		System.out.println ();
		System.out.print ("Сhoose an action: " + "\n" + 
							"1. Continue working with library" + "\n" + 
							"2. Finish working with library");
	}

}
