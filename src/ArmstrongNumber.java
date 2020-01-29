import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int num =0;
        System.out.println("Input your 3 digit number and press enter: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        int originalNumber, remainder, result = 0;
        originalNumber = num;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}