package Controller;

public class ControllerMenu {

    public static void menu() {
        MenuText menuText = new MenuText();
        InputController input = new InputController();


        menuText.printMenuText();


        int choice = input.scanInt();
        switch (choice) {
            case 1 -> {
                input.printString("Enter Users");
                menu();
            }
            case 2 -> {
                input.printString("You pressed 2");
                menu();
            }
            case 3 -> {
                input.printString("You quit");
                break;
            }
        }
    }
}


