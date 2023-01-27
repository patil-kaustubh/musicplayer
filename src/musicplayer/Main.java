package musicplayer;
public class Main {
	public static boolean loop = true;
	
	public static void main(String[] args) {
		
		MainMenu mainMenu =  new MainMenu();
		
		while(loop)
		{
			mainMenu.printMenu();
		}
	}
    
}