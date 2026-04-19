package oops;

public class AbstractionClass {
    
    public static void main(String[] args) {
        fish fh = new fish();
        fh.bark();
        fh.swim();
        mammal mm = new mammal();
        mm.setAge(34);
        System.out.println(mm.getage());

    }

}

abstract class animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void bark();
}

class mammal extends animal {
    private int age;

    void setAge(int age) {
        this.age = age;
    }

    int getage() {
        return this.age;

    }

    void bark() {
        System.out.println("Mammals barks");
    }
}

class fish extends animal {
    void bark() {
        System.out.println("FIsh dont barks");
    }

    void swim() {
        System.out.println("fish Swwiims ");
    }
}