package company.Lockers.com;
public class HomePage {

	final static String PATHNAME="C:\\Users\\kunal chauhan\\eclipse-workspace\\Core Java\\src\\company\\Lockers";
	
	
	public static void main(String[] args) {
		
		System.out.println("\n****************** LockedMe.com *********************"+
							"\n***************** Kunal Chauhan ******************"+
							"\n\nDIRECTORY : "+PATHNAME);
		
		
		MainMenu mainMenu= new MainMenu(PATHNAME);
		mainMenu.showMenu();
		
	}
}