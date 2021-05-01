package Controller;

import CreateUser.AccountList;

public class ControllerMenu {


    public static void menu() {
        MenuText menuText = new MenuText();
        InputController input = new InputController();
        AccountList accountList = new AccountList();

        menuText.printMenuText();


        int choice = input.scanInt();
        switch (choice) {
            case 1 -> {
                accountList.addAccount();
                menu();
            }
            case 2 -> {
                input.printString("You pressed 2");
                menu();
            }
            case 3 -> {
                input.printString("Show all users");
                accountList.printAccounts();
                menu();
            }
            case 4 ->{
                input.printString("You quit");
            }
            default -> {
                input.printString("Enter between 1-3");
            }
        }
    }
}


