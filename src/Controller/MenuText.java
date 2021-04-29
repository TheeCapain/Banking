package Controller;

public class MenuText {
    private String[] menuText = new String[]{"1.", "2.", "3"};
    private InputController input = new InputController();

    public void printMenuText() {
        for (int i = 0; i< menuText.length;i++){
           input.printString(menuText[i]);
        }

    }
}


