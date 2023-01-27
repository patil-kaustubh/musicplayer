package musicplayer;
public class MainMenu implements Menu {
	
    public static boolean subMenuLoop=true;
    
	// implementation of methods of interface menu
    public void printMenu(){
    	System.out.println("\n\n------------------------------------------------");
     	System.out.println("                MAIN MENU");
     	System.out.println("------------------------------------------------");
     	System.out.println("1 : Play a song");
     	System.out.println("2 : Add / Remove a song");
     	System.out.println("3 : Update song");
     	System.out.println("4 : Exit");
     	System.out.println("------------------------------------------------\n");
     	System.out.print("Please select your option : ");
     	this.executeUserAction(this.getUserInput());
    }
    
    public int getUserInput()
    {
    	return Utility.getUserInput();
    };

    public void executeUserAction(int userChoice)
    {
    	subMenuLoop=true;
    	
    	switch(userChoice) {
    	case 1:
    		PlaySongMenu playSongMenu = new PlaySongMenu();
    		while(subMenuLoop) {
    			playSongMenu.printMenu();
    		}    		
    		break;
    	case 2:
    		AddRemoveSongMenu addRemoveSongMenu = new AddRemoveSongMenu();
    		while(subMenuLoop) {
    			addRemoveSongMenu.printMenu();
    		}
    		break;
    	case 3:
    		UpdateSongMenu updateSongMenu = new UpdateSongMenu();
    		while(subMenuLoop) {
    			updateSongMenu.printMenu();
    		}
    		break;
    	case 4:
    		Main.loop = false;
    		System.out.println("------------EXITED FROM MUSIC PLAYER------------\n");
    		break;
    		
    	default:
    		System.out.println("Invalid input.");
    	
    	}
    	
    }
		
}