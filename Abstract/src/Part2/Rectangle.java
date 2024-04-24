package Part2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    @Override
    public double getArea() {
        return length * width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle {" + "length=" + length + ", width=" + width + '}';
    }
}
