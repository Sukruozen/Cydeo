package day16;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Please enter a string:");
        String word=s.nextLine().trim();
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);
        }
        char a =65;//(A)
        int b=a+2;

        System.out.println(a);
        System.out.println(b);
    }
}
