package Controller;

import java.util.Scanner;

public class InputController {
    private final Scanner scan = new Scanner(System.in);

    public int scanInt(String errorMessage){
        while(!scan.hasNext()){
            printString(errorMessage);
            scan.next();
        }
        return scan.nextInt();

    }
    public void printString(String message){
        System.out.println(message);
    }
}
