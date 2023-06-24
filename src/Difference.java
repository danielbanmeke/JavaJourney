import java.util.Scanner;
public class Difference
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int difference;

        System.out.println("Enter first integer");
        number1 = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();

        difference = number1 - number2;

        System.out.printf("Difference is %d%n", difference);
    }

}
