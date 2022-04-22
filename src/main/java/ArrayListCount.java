import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayListCount {
    public static void main(String[] args) {
        var myArray = new ArrayList<Integer>();
        var strArray = new ArrayList<String>();
        var reverseArrayCount = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        var lastWord = " ";
        System.out.println("please enter a sentence");
        var mySentence = input.nextLine();
        var str = new StringTokenizer(mySentence);
        System.out.println(str.countTokens());

        while (str.hasMoreTokens()) {
            var word = str.nextToken();

            myArray.add(word.length());
            var stringBuilder = new StringBuilder(word);
            strArray.add(stringBuilder.reverse().toString());
            if(word.contains().)
            reverseArrayCount.add(word.length()-1);

        }
        System.out.println(myArray);
        System.out.println(strArray);
        System.out.println(reverseArrayCount);
    }
}

