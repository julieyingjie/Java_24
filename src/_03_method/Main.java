package _03_method;

public class Main {
    public static void main(String[] args) {

    }

    public static double sum(int a, double b, long c){
        return a+b+c;
    }

    // different parameter numbers
    public static double sum(int a, double b, long c, short d ){
        return a+b+c;
    }

    // different parameter type
    public static double sum(int a, double b, long c, byte d ){
        return a+b+c;
    }

    // different parameter order
    public static double sum(double b, int a, long c ){
        return a+b+c;
    }

}
