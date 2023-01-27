package musicplayer;

// interface contain method signature only
public interface Menu {
    public void printMenu();

    public void executeUserAction(int userChoice);

    public int getUserInput();
}