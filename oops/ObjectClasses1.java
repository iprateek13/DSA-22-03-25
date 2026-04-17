package oops;

public class ObjectClasses1 {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.Username = "hello";
        System.out.println(user1.Username);
        user1.setUsername("hi hi Opps");
        System.out.println(user1.Username);
        user1.setPassword(123);
        System.out.println(user1.getpass());
    }
}

class BankAccount {
    public String Username;
    private int passWord;

    void setUsername(String myName) {
        Username = myName;
    }

    void setPassword(int recievedpass) {
        passWord = recievedpass;
    }

    int getpass() {
        return passWord;
    }

}