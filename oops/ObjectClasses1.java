package oops;

public class ObjectClasses1 {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        BankAccount user2 = new BankAccount();
        user1.setPassword(9442);
        System.out.println("User1 Pass : " + user1.getpass());
        user1.setUsername("hi hi Opps");

        System.out.println("usernmae of User1:  " + user1.getUsername());
        user1.setPassword(123);
        System.out.println("user1 pass :" + user1.getpass());
        user2.setPassword(344);
        System.out.println("user2pass :" + user2.getpass());
        user1.setPassword(3233);
        System.out.println("user1 pass : " + user1.getpass());
        user2.setUsername("hhelo");
        System.out.println("user2 user :" + user2.getUsername());

    }
}

class BankAccount {
    private String Username;
    private int passWord;

    void setUsername(String myName) {
        this.Username = myName;
    }

    void setPassword(int passWord) {
        this.passWord = passWord;
    }

    int getpass() {
        return this.passWord;
    }

    String getUsername() {
        return this.Username;
    }
}