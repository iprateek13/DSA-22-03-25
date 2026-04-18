package oops;

public class MethodOverriding {
    public static void main(String[] args) {
        parent a = new parent();
        a.speak();
        child ch = new child();
        //function vhi call hoga jiska object bnega ,,jis object se  jis function ko call kiya jayega vhi 
        // call hoga
        ch.speak();


    }
}

class parent {
    void speak() {
        System.out.println("parent Speak");
    }
}

class child {
    void speak() {
        System.out.println("child Speak");
    }
}
