import static java.lang.Math.PI;

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {

    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    double getArea() {
        double p = (side1 + side3 + side2) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}

class Rectangle extends Shape {

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    double getArea() {
        return a * b;
    }
}

class Circle extends Shape {

    double rad;
    double pi = PI;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    double getPerimeter() {
        return 2 * rad * pi;
    }

    @Override
    double getArea() {
        return rad * rad * pi;
    }
}