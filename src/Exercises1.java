import java.util.Arrays;
import java.util.Scanner;
public class Exercises1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int b;
        int c;
        int a;
        System.out.print("Enter first integer");
        b = input.nextInt();
        System.out.print("Enter second integer");
        c = input.nextInt();
        a = b * c;
        System.out.printf("Product is %d%n", a);
    }
}
