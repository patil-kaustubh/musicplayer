package musicplayer;

public class UpdateSongMenu implements Menu {
	// implementation of methods of interface menu
    public void printMenu(){
    	System.out.println("\n\n------------------------------------------------");
     	System.out.println("                UPDATE SONG MENU");
     	System.out.println("------------------------------------------------");
     	System.out.println("1 : Name");
     	System.out.println("2 : Singer");
     	System.out.println("3 : Album");
     	System.out.println("4 : Back");
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
    		System.out.println("Name updated.");
    		break;
    	case 2:
    		System.out.println("Singer updated");
    		break;
    	case 3:
    		System.out.println("Album updated");
    		break;
    	case 4:
    		MainMenu.subMenuLoop=false;
    		break;
    		
    	default:
    		System.out.println("Invalid input.");
    	
    	}
    	
    }
}
