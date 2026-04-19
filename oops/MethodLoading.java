package oops;

public class MethodLoading {
    public static void main(String[] args) {
        Parent23 child = new Parent23();

        System.out.println(child.ageSum(2, 3));
        System.out.println(child.ageSum(2, 3, 4));
        System.out.println(child.ageSum(3.3f, 4.5f));
    }
}

class Parent23{
    int ageSum(int a, int b) {
        return a + b;
    }

    int ageSum(int a, int b, int c) {
        return a + b + c;
    }

    float ageSum(float a, float b) {
        return a + b;
    }
}