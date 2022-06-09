package day14;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

         */
        System.out.println("Enter a word, i will erase x if it starts with it!");
        String word=input.next();
        if(word.charAt(0)=='x'){
            word=word.substring(1);
        }
        System.out.println(word);
        input.close();
    }
}
