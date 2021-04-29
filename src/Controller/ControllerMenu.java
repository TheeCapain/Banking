package Controller;
public class ControllerMenu {

    public static void controller () {
InputController input = new InputController();
        switch (input.scanInt("Must enter an int")){
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
            case 4 -> {
                input.printString("You pressed 4");
                break;
            }
            case 5 -> {
                input.printString("You pressed 5");
            }
            case 9 -> {
                input.printString("You quit");
                break;
            }
        }
    }
}


