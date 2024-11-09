package _04_oop;

import _04_oop.model.Dog;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Random random = new Random();
        dog1.age = 10;
        dog1.weight = 10.0d;
        dog1.run();

        Dog dog2 = new Dog();
        dog2.age = 20;
        dog2.weight = 20.0d;
        dog2.run();
//        Dog ddg = new Dog();
//        ddg.age = 10;
//        ddg.weight = 10.5d;
//        ddg.run();
//        ddg.eat("meat");
//
////        ddg = null;
//        Dog[] dogs = new Dog[7];
//        for (int i = 0; i < dogs.length; i++) {
//            dogs[i] = new Dog();
//            System.out.println(dogs[i]);
//            System.out.println(dogs[i].hashCode());
//        }



    }
}
