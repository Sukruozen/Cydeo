package Day09;

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a digit between 0 and 9 : ");
        byte num1= scanner.nextByte();
        String number=(num1==1)?"One":(num1==2)?"Two":(num1==3)?"Three":(num1==4)?"Four":(num1==5)?"Five"
                :(num1==6)?"Six":(num1==7)?"Seven":(num1==8)?"Eight":(num1==9)?"Nine":"Invalid number";
        System.out.println("number = " + number);
    }
}
