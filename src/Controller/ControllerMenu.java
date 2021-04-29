package Controller;

public class ControllerMenu {

    private int choice;

    public static void menu() {
        MenuText menuText = new MenuText();
        InputController input = new InputController();
        menuText.printMenuText();


        int choice = input.scanInt();
        switch (choice) {
            case 1 -> {
                input.printString("You pressed 1");
            }
            case 2 -> {
                input.printString("You pressed 2");
                break;
            }
            case 3 -> {
                input.printString("You pressed 3");
                break;
            }
            case 9 -> {
                input.printString("You quit");
                break;
            }
        }
    }
}


