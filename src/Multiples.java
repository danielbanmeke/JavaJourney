import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter first integer");
        number1 = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();

        if (number2 % number1 >= 1)
        {
            System.out.printf("Multiple of %d%n", number2);
        }
        if (number2 % number1 < 1)
        {
            System.out.printf("Not Multiple of %d%n", number2);
        }
    }
}
