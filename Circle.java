public class Circle extends Shape {
    double radius;

    final double PI = Math.PI;

   public double getArea(){
    return Math.PI * Math.pow(radius,2);
   }

   public double getCircumference(){
    return getPerimeter();
   }

   @Override
   public double getPerimeter() {
       return 2 * PI * radius;
   }
}
