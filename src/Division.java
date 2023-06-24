import java.util.Scanner;
public class Division
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int division;

        System.out.println("Enter first integer");
        number1 = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();

        division = number1 / number2;

        System.out.printf("Division is %d%n", division);
    }
}
