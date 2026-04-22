package oops;

public class MethodOverriding {
    public static void main(String[] args) {
        Parent123 a = new Parent123();
        a.speak();
        Child132 ch = new Child132();
        //function vhi call hoga jiska object bnega ,,jis object se  jis function ko call kiya jayega vhi 
        // call hoga
        ch.speak();
    }
}

class Parent123 {
    void speak() {
        System.out.println("parent Speak");
    }
}

class Child132 {
    void speak() {
        System.out.println("child Speak");
    }
}
