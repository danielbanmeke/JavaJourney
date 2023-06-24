import java.util.Scanner;
public class Largestandsmallestintegers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        int largest;
        int smallest;

        System.out.println("Enter first integer");
        number1 = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();
        System.out.println("Enter third integer");
        number3 = input.nextInt();
        System.out.println("Enter fourth integer");
        number4 = input.nextInt();
        System.out.println("Enter fifth integer");
        number5 = input.nextInt();

        smallest = number1;
        if (number2 < smallest)
        {
            smallest = number2;
        }

        if (number3 < smallest)
        {
            smallest = number3;
        }

        if (number4 < smallest)
        {
            smallest = number4;
        }

        if (number5 < smallest)
        {
            smallest = number5;
        }

        largest = number1;
        if (number2 > largest)
        {
            largest = number2;
        }

        if (number3 > largest)
        {
            largest = number3;
        }

        if (number4 > largest)
        {
            largest = number3;
        }

        if (number5 > largest)
        {
            largest = number5;
        }

        System.out.printf("Largest is %d%n", largest);
        System.out.printf("smallest is %d%n", smallest);
    }

}
