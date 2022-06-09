package Day09;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        /*
        6. Create a class called EqualNumbers, and write a program that can check the equality of the three given numbers
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
         */
        Scanner entry=new Scanner(System.in);
        System.out.print("Please enter first number:");
        int num1= entry.nextInt();
        System.out.print("Please enter second number:");
        int num2= entry.nextInt();
        System.out.print("Please enter third number:");
        int num3=entry.nextInt();
        String result="";
        if (num1==num2 && num1==num3){
            result="All numbers are equal";
        } else if (num1==num2) {
            result="num1 is equal to num2";           
        } else if (num2==num3) {
            result="num2 is equal to num3";
        } else if (num1==num3) {
            result="num1 is equal to num3";
        } else {
            result="none of the numbers are equal!";
        }
        System.out.println("result = " + result);
    }
}
