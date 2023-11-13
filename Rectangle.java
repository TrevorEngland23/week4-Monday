public class Rectangle extends Shape{

    double base;
    double height;

    @Override
    public double getArea() {
        return base * height;
    }
}
