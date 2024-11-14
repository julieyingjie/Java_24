package _05_static_final;

public class Student extends Person {
    static {
        System.out.println("Student static block");
    }
    {
        System.out.println("Student block");
    }

    public Student() {
        System.out.println("Student constructor");
    }
}
