package oops;

public class Oops1 {
    public static void main(String[] args) {
        mobile m1 = new mobile();
        mobile m2 = new mobile();
        m1.name = "hhelo";
        m2.name = "jisanam";
        System.out.println(m1.name);
        System.out.println(m2.name);
        m2.mobile();
        laptop l1 = new laptop();
        l1.laptop();
    }
}

class mobile {
    String name;
    int model;

    void mobile() {
        System.out.println("mobile is not the best for the student");
    }
}

class laptop {
    void laptop() {
        System.out.println("laptop run fast");
    }
}