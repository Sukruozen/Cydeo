package day14;

import java.util.Scanner;

public class FirstCharacterType {
    public static void main(String[] args) {
        /*
    5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
        HINT: 1. you need charAt() method
              2. Ascii Table
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Gimme a word and i will know the type of first character");
        String word=input.next();
        input.close();
        String result=(word.charAt(0)>47 && word.charAt(0)<58)?"first character is digit":
                (word.charAt(0)>96 && word.charAt(0)<123)?"first character is lowercase letter":
                        (word.charAt(0)>64 && word.charAt(0)<91)?"first character is uppercase letter":
                                "first character is special character";
        System.out.println(result);

    }
}
