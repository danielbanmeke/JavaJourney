import java.util.Scanner;
public class Comparingintegers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.println("Enter first integer");
        number1 = input.nextInt();
        System.out.println("Enter second integer");
        number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println(number1 +  "is larger");
            }
        if (number2 > number1){
            System.out.println(number2 + "is larger");
        }
        if (number1 == number2);
        {
            System.out.println("These numbers are equal");
        }
        if (number1 != number2);
        {
            System.out.println("");
        }
    }
}
