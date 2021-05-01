package Controller;

public class MenuText {
    private final String[] menuText = new String[]{"1. Create user", "2. Login","3. Show users", "4. Quit"};
    private final InputController input = new InputController();

    public void printMenuText() {
        for (int i = 0; i< menuText.length;i++){
           input.printString(menuText[i]);
        }

    }
}


