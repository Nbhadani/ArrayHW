
public class SumValuesOfArray {
    public static void main(String[] args) {
        int my_num_array[] = {9,1,7,5,4,2,3,6,8,10};
        int sum = 0;

        for (int i : my_num_array)
            sum += i; //Add And Assignment Operator
        System.out.println("The sum is " + sum);
    }
}