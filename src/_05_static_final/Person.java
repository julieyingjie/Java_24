package _05_static_final;

public class Person {
//    public int age;
//    public static int count;
//
//    //initialization block
//    {
//        age = 1;
//    }
//    public Person() {
////        count++; // 计数器， 用来计算一共有多少个对象被创建
//    }
//
//    public Person(int age) {
//        this.age = age;
//    }
//
//    public void func(int age) {
//        func1();
//        System.out.println(count);
//    }
//    public static void func1() {
//        func2();
////        func(); Non-static method 'func(int)' cannot be referenced from a static context
//    }
//
//    public static void func2() {
//        func1();
//        System.out.println(count);
//    }
    static {
    System.out.println("Person static block");
}
    {
        System.out.println("Person block");
    }

    public Person() {
        System.out.println("Person constructor");
    }
}
