import java.util.Scanner;

class Main
{
    private static int Practice (String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args)
    {
        System.out.println("Input your String in lower case: ");
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();

        char ch = 'a';

        System.out.println("Character " + ch + " occurs " + Practice(st, ch) + " times.");
    }
}
