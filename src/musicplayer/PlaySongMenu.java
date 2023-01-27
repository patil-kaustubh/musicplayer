package musicplayer;

public class PlaySongMenu implements Menu {
	// implementation of methods of interface menu
    public void printMenu(){
    	System.out.println("\n\n------------------------------------------------");
     	System.out.println("                PLAY SONG MENU");
     	System.out.println("------------------------------------------------");
     	System.out.println("1 : Play all songs");
     	System.out.println("2 : Choose song");
     	System.out.println("3 : Play random");
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
    		System.out.println("Playing all songs");
    		break;
    	case 2:
    		System.out.println("Chosen song playing");
    		break;
    	case 3:
    		System.out.println("Playing random song");
    		break;
    	case 4:
    		MainMenu.subMenuLoop=false;
    		break;
    		
    	default:
    		System.out.println("Invalid input.");
    	
    	}
    	
    }
}
