import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var myArray = new ArrayList<Integer>();
        System.out.println("please enter a sentence");
        var myWord = scan.nextLine();
        StringTokenizer tokens = new StringTokenizer(myWord);
        System.out.println(tokens.countTokens());
        var countThes = 0;
        var lastWord = " ";
        while(tokens.hasMoreElements()){
            lastWord = tokens.nextToken();
            if(lastWord.equalsIgnoreCase("the"))
                countThes++;

        }

        System.out.println(countThes);

        System.out.println(lastWord.length());
    }

}

