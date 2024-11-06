package _01_basic;

public class Main {

    public static void main(String[] args) {

//        boolean res1 = false & getBoolean();
        boolean res1 = false | getBoolean();
        System.out.println(res1);
//        boolean res2 = false && getBoolean();
        boolean res2 = false || getBoolean();
        System.out.println(res2);
    }

    public static boolean getBoolean(){
        System.out.println("getBoolean");
        return true;
    }
}
