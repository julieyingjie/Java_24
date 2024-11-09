package _04_oop.model;

import _04_oop.Animal;

public class Dog extends Animal {
    public int age;
    public double weight;

    public Dog() { }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(int age, double weight) {
        this(age);
        this.weight = weight;
    }

    @Override
    protected Integer speak(){
        return null;
    }


    public void run(){
        System.out.println(age + "_" + weight + "_run");
    }

    public void eat(String food){
        System.out.println(age + "_" + weight + "_eat_" + food);
    }
}
