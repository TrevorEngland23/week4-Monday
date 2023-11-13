public class Triangle extends Shape{

    double height;
    double base;
    double side1;
    double side2;
    

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
       return side1 + side2 + base;
    }
}
