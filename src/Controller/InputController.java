package Controller;

import java.util.Scanner;

public class InputController {
    private final Scanner scan = new Scanner(System.in);

    public int scanInt(){
        return scan.nextInt();

    }
    public void printString(String message){
        System.out.println(message);
    }
}
