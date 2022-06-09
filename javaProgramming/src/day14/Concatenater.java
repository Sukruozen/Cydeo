package day14;

import java.util.Scanner;

public class Concatenater {
    public static void main(String[] args) {
        /*
          4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.Input:one    eight
                    Output:
                        oneight
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two words:");
        String first=input.next();
        String second =input.next();
        String concatenator;
        if(first.charAt(first.length()-1)==second.charAt(0)){
            concatenator=first+second.substring(1);
        }else concatenator=first+second;
        System.out.println(concatenator);
        input.close();
    }
}
