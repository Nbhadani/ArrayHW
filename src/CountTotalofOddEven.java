import java.util.Scanner;

public class CountTotalofOddEven {

    public static void main(String[] args) {

        System.out.println("Input your 5 digit number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int ectr=0, octr=0, esum=0, osum=0;

        while ( input>0)
        {
            int num=input%10;
            if(num %2==0)
            {
                ectr++;
                esum=esum+num;
            }
            else
            {
                octr++;
                osum=osum+num;
            }

            input = input/10;

        }

        System.out.println( " Total count of Odd digits are :" +octr);
        System.out.println( " Total count of Even digits are :" +ectr);
        System.out.println( " Sum of Odd digits are :" +osum);
        System.out.println( " Sum of Even digits are :" +esum);
    }
}
