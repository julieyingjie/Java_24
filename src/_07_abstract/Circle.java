package _07_abstract;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculate() {
        girth =  2 * Math.PI * radius ;
        area = Math.PI * radius * radius;
    }

}
