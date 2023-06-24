import java.util.Scanner;
public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        int product;
        int difference;
        int division;

        System.out.print("Enter first integer");
        number1 = input.nextInt();

        System.out.print("Enter second integer");
        number2 = input.nextInt();

        sum = number1 + number2;
        product = number1 * number2;
        difference = number1 - number2;
        division = number1/number2;
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n", product);
        System.out.printf("Difference is %d%n", difference);
        System.out.printf("Division is %d%n", division);
    }
}
