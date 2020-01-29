import java.util.Scanner;

public class MultiplicationTable {

    public static void main (String args[]){


        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i=1;
        do{
            int j=1;
            do{
                System.out.print(i*j+"\t");
                j++;
            }while(j<=12);
            i++;
            System.out.println();
        }while(i<=num);

    }


}
