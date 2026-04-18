package oops;

public class HierachialInheritence {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.discipline();
        GrandChild gh = new GrandChild();
        System.out.println(gh.getMessage());
    }
}

// Level 1 (Base Class)
class Parent {

    private String message = "Follow discipline and values";

    public String getMessage() {
        return message;
    }

    void discipline() {
        System.out.println("Maintains discipline");
    }

    void guide() {
        System.out.println("Provides guidance");
    }
}

// Level 2 (Derived from Parent)
class Child extends Parent {

    String communicationStyle = "Speaks in a modern way";

    void work() {
        System.out.println("Works efficiently but learning");
    }

    void listen() {
        System.out.println("Listens selectively");
    }
}

// Level 3 (Derived from Child)
class GrandChild extends Parent {

    void identity() {
        System.out.println("Represents next generation");
    }
}
