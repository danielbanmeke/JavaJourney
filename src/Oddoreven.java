import java.util.Scanner;
public class Oddoreven {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int value;

        System.out.println("Enter integer");
        value = input.nextInt();


        if (value % 2 == 0 )
        {
            System.out.println("even");
        }

        if (value % 2 != 0)
        {
            System.out.println("odd");
        }
    }

}
