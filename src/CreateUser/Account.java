package CreateUser;

public class Account {
    private String name;
    private String password;
    private int accountID;

    //Create Account
    public Account(String name, String password, int accountID) {
        this.name = name;
        this.password = password;
        this.accountID = accountID;
    }

    @Override
    public String toString() {
        return  "Name: " + name +
                "Password: " + password +
                "ID: " + accountID;
    }
}
