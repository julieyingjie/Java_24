package _07_abstract;

public abstract class Shape {
    protected double girth;
    protected double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGirth() {
        return girth;
    }

    public void setGirth(double girth) {
        this.girth = girth;
    }

    public void show(){
        System.out.println("The girth is " + getGirth());
        System.out.println("The area is " + getArea());
    }

    public abstract void calculate();
}
