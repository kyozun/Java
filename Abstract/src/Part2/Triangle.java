package Part2;

public class Triangle extends Shape {
    private double base;
    private double height;


    @Override
    public double getArea() {
        return (base * height) / 2;
    }
}
