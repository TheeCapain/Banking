package Controller;

import java.util.Scanner;

public class InputController {
    private Scanner scan = new Scanner(System.in);

    public int scanInt(String errorMessage){
        while(!scan.hasNext()){
            printString(errorMessage);
            scan.next();
        }
        int readInt = scan.nextInt();
        return readInt;

    }
    public void printString(String message){
        System.out.println(message);
    }
}
