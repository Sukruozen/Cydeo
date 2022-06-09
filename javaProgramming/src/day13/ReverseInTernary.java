package day13;

import java.util.Scanner;

public class ReverseInTernary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word with five letters:");
        String word=input.next();
        input.close();
        int lengthOfTheWord=word.length();
        String result;
        result=(lengthOfTheWord > 5) ? "Too Long":
        (lengthOfTheWord < 5) ?"Too Short":
        ""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);


        System.out.println(result);

    }
}
