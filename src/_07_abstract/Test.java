package _07_abstract;

public class Test {
    public static void main(String[] args) {
//       SubClass subClass = new SubClass();
//
////       Rectangle rectangle = new Rectangle(5,10);
////       rectangle.calculate();
////        System.out.println("girth : " + rectangle.getGirth());
////        System.out.println("area : " + rectangle.getArea());
//
//        Circle circle = new Circle(5);
//        circle.calculate();
//        circle.show();

//        Rectangle rectangle = new Rectangle(5, 10);
//        rectangle.calculate();
//        rectangle.show();
//
//        Triangle triangle = new Triangle(5, 10);
//        triangle.calculate();
//        triangle.show();

        Shape shape1 = new Rectangle(5,10);
        shape1.calculate();
        shape1.show();
        Shape shape2 = new Circle(5);
        shape2.calculate();
        shape2.show();
//        Shape shape3 = new Triangle(5,10);

    }
}
