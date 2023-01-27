package musicplayer;

public class AddRemoveSongMenu implements Menu {
	// implementation of methods of interface menu
    public void printMenu(){
    	System.out.println("\n\n------------------------------------------------");
     	System.out.println("                ADD/REMOVE SONG MENU");
     	System.out.println("------------------------------------------------");
     	System.out.println("1 : Add song");
     	System.out.println("2 : Remove song");
     	System.out.println("3 : Back");
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
    	switch(userChoice) {
    	case 1:
    		System.out.println("Song added");
    		break;
    	case 2:
    		System.out.println("Song removed");
    		break;
    	case 3:
    		MainMenu.subMenuLoop=false;
    		break;
    		
    	default:
    		System.out.println("Invalid input.");
    	
    	}
    	
    }
}
