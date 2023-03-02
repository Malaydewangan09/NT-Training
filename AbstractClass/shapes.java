package AbstractClass;

public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and setter methods for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override perimeter() method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Override area() method
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter and setter methods for length and width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Override perimeter() method
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    // Override area() method
    @Override
    public double area() {
        return length * width;
    }
}
