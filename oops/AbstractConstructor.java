package oops;

public class AbstractConstructor {

    public static void main(String[] args) {
        B obj = new B();
        System.out.println("obj y : "+obj.y);
        obj.changeXOFa(20);
        System.out.print(obj.getage());
    }
}

abstract class A {
    int x;

    A() {
        x = 10;
        System.out.println("x is Abstrack class A :" + x);
        System.out.println("A ka constructor");
    }
}

class B extends A {
    int y;

    B() {
        y = 20;
        System.out.println("B ka constructor");
    }

    void changeXOFa(int age) {
        x = age;
    }

    int getage() {
        return x;
    }
}
