import java.util.Scanner;

public class FibonacciNumber
{
    public static void main(String[] args)
    {
        Scanner sc1 = new Scanner(System.in);
        int num;

        int first = 0,
                second = 1,
                third;

        System.out.print("Enter number of terms of series : ");
        num = sc1.nextInt();

        System.out.print(first + " " + second + " ");

        for(int i = 3; i <= num; i++)
        {
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}