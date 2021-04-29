package Controller;

public class ControllerMenu {
    private static InputController input;

    public ControllerMenu(InputController input) {
        ControllerMenu.input = input;
    }

    public static void menu() {
        int choice = input.scanInt("Wrong");

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


