package CreateUser;

import Controller.InputController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AccountList {
    private File accounts;
    ArrayList<Account> accountsList = new ArrayList<>();
    InputController input = new InputController();
    private String name;
    private String password;

    public AccountList() {
        accountsList.add(new Account("August", "1234", 0001));
    }


    public void printAccounts() {
        readAccountsFile();
        for (int i = 0; i < accountsList.size(); i++) {
           input.printString(accountsList.get(i).toString());
        }

    }

    public void addAccount() {
        InputController input = new InputController();

        input.printString("What is your name");
        setName(input.scanString());

        input.printString("Password");
        setPassword(input.scanString());


        accountsList.add(new Account(getName(), getPassword(), 1));
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    // FILEREADER TO SAVE ACCOUNTS

    public void readAccountsFile() {
        Random random = new Random();
        InputController inputController = new InputController();
        try {
            new File("AccountList.txt");
            Scanner read = new Scanner(accounts);
            do {
                read.hasNextLine();
            }
            while (read.hasNextLine()); {

                String name = read.nextLine();
                String password = read.nextLine();
                int id = random.nextInt();
                accountsList.add(new Account(name,password,id));
            }
            read.close();
        } catch (FileNotFoundException e) {
            inputController.printString("An error occurred");
            e.printStackTrace();
        }
    }

}
