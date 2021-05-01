package CreateUser;

import Controller.InputController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountList {
    private File accounts;

    public void readAccountsFile() {
        InputController inputController = new InputController();
        try {
            new File("AccountList.txt");
            Scanner read = new Scanner(accounts);
            while (read.hasNextLine()) {
                String data = read.nextLine();
                inputController.printString(data);
            }read.close();
        }catch (FileNotFoundException e){
            inputController.printString("An error occurred");
            e.printStackTrace();
        }
    }
}
