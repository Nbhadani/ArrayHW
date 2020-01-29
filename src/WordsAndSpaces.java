import java.util.Scanner;

class WordsAndSapces
{
    public static void main(String...s)
    {
        int wordctr=1;
        System.out.println("Input your String in Sentence: ");
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();


        for(int i=0;i<st.length();++i)
        {
            if(st.charAt(i)==' ')
                wordctr++;
        }

        System.out.println("Number of words="+wordctr);
        System.out.println("Number of spaces="+(wordctr-1));
    }
}