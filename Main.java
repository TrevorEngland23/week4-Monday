import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
   
        StudentLogic();

        Triangle triangle = new Triangle(30, 21);
        double area = triangle.getArea();
        System.out.println("Area: " + area);

        Circle circle = new Circle(); // instance
        Rectangle rectangle = new Rectangle(); // instance

        isShape(triangle);
        isShape(circle);
        isShape(rectangle);
        isShape(null);
    }

    public static void StudentLogic(){
        Student student1 = new Student("Trevor", "England");
        // student1.major = "Computer Science";

        Student student2 = new Student("Bill", "Watts");
        Student student3 = new Student("Gir", "Mal");
        Student student4 = new Student("Zelda", "Rings");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1); 
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for(Student student: students){
          student.Display();
        }
    }

    public static void isShape(Shape shape){
        if(shape instanceof Shape){
            System.out.println("This is a shape.");
        } else {
            System.out.println("This is not a shape.");
        }
    }
}