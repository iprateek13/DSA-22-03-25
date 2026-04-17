package oops;

import bitmanipulation.setIthBit;

public class Constrictors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 12;
        System.out.println(s1.age);
        s1.setName("ka ho babua");
        System.out.println(s1.getName());
        Student s2 = new Student("hhelo");
        System.out.println(s2.getName());

    }
}

class Student {
    int age;
    String name;

    Student() {
        System.out.println("heelddo");
    }

    Student(String str) {
        this.name = str;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
