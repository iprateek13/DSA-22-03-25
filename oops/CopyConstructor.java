package oops;

public class CopyConstructor {

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.marks[0] = 12;
        s1.marks[1] = 2;
        s1.marks[2] = 23;
        Student1 s3 = new Student1(s1);
        s3.marks[2] = s1.marks[2] + 2;
        s3.marks[1] += 3;
        System.out.println("....s1 marks ");
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.print(s1.marks[i] + " ");
        }
        System.out.println();
        System.out.println("s3 Object__________");
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.print(s3.marks[i] + " ");
        }
    }

}

class Student1 {
    int[] marks = new int[3];

    Student1() {
        // agr dusra contsructor nhi bnate to iski jrurt nhi hoti par hmne define kr
        // diya hai islye bnana pad rha
    }

    // shallow copy constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.age = s1.age;
    // this.name = s1.name;
    // this.marks = s1.marks;
    // }
    Student1(Student1 s1) {
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

}
