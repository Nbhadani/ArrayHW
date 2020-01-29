import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args){

        int[] my_num_array = {9,1,7,4,2,5,3,6,8,0};

        String[] my_string_array = {"H","B","I","E","C","J","A","F","D","G"};

        System.out.println("");

        System.out.println("Original numeric array : "+Arrays.toString(my_num_array));
        Arrays.sort(my_num_array); // KEY method
        System.out.println("Sorted numeric array : "+Arrays.toString(my_num_array));

        System.out.println("");
        System.out.println("Original string array : "+Arrays.toString(my_string_array));
        Arrays.sort(my_string_array); // key method
        System.out.println("Sorted string array : "+Arrays.toString(my_string_array));
    }
}

