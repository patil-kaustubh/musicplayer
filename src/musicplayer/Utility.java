package musicplayer;

import java.util.Scanner;

public class Utility {
	public static Scanner scanner = new Scanner(System.in);
	
    public static Scanner getScanner() {
    	return scanner;
    }
    
    public static int getUserInput() 
    {
    	return scanner.nextInt();	
    }
}