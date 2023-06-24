import java.util.Arrays;
import java.util.Scanner;

public class Product2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int w;
        int x;
        int y;
        int z;
        int result;
        System.out.print("Enter first integer");
        w = input.nextInt();
        System.out.print("Enter second integer");
        x = input.nextInt();
        System.out.print("Enter third integer");
        y = input.nextInt();
        System.out.print("Enter fourth integer");
        z = input.nextInt();
        result = w * x * y * z;
        System.out.printf("Product is %d%n", result);

    }
}
