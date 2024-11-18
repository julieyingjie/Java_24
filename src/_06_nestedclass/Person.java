package _06_nestedclass;

public class Person {
    private static int age;

    public static void func1(){
        System.out.println(" ");
    }
    public static class Car{
        private static int num;

        public void func(){
            System.out.println(age);
            func1();
        }
    }

//    public class Hand{
//        private int weight;
//    }
}
