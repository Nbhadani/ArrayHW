public class SpecificValue {
    public static boolean checkvalue(int[] arr, int checkitem) {
        for (int value : arr) {
            if (checkitem == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int ar[] = {9,1,7,5,4,2,3,6,8,10};
        System.out.println(checkvalue(ar, 4));
        System.out.println(checkvalue(ar, 12));
        System.out.println(checkvalue(ar, 10));
    }
}

