package Controller;

import CreateUser.CreateAccount;

public class ControllerMenu {


    public static void menu() {
        MenuText menuText = new MenuText();
        InputController input = new InputController();
        CreateAccount createAccount = new CreateAccount();

        menuText.printMenuText();


        int choice = input.scanInt();
        switch (choice) {
            case 1 -> {
                input.printString("Enter Users");
                createAccount.createUserName(input.scanString());
                menu();
            }
            case 2 -> {
                input.printString("You pressed 2");
                menu();
            }
            case 3 -> {
                input.printString("You quit");
            }
            default -> {
                input.printString("Enter between 1-3");
            }
        }
    }
}


