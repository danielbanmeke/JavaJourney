import com.sun.jdi.DoubleValue;

import java.lang.Double;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {


        System.out.println("Enter radius");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double PI = (3.14159);

        double Diameter = 2 * radius;
        double Circumference = 2 * PI * radius;
        double Area = PI * (radius * radius);

        System.out.println("Diameter is," + Diameter);
        System.out.println("Circumference is," + Circumference);
        System.out.println("Area is "+ Area);
    }
}
