package day08;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner taken=new Scanner(System.in);
        System.out.print("Please enter first number:");
        int num1= taken.nextInt();
        System.out.print("Please enter second number:");
        int num2=taken.nextInt();
        if (num1>num2){
            System.out.println("num1 is the maximum number");
        } else if (num1==num2) {
            System.out.println("These numbers are equal");
        } else {
            System.out.println("num2 is the maximum number");
        }
    }
}
