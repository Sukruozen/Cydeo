package day14;

import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two words:");
        String first=input.next();
        String second=input.next();
        first=first.substring(1);
        second= second.substring(1);
        System.out.println(first+second);
        input.close();
    }
}
