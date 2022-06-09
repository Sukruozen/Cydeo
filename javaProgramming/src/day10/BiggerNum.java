package day10;

import java.util.Scanner;

public class BiggerNum {
    public static void main(String[]args){
        /*
        5. Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.
        you get 3 int variables with DIFFERENT values: n1 , n2 and n3
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
         NOTE: MUST USE TERNARY
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1= scanner.nextInt();
        System.out.print("Please enter second number: ");
        int num2= scanner.nextInt();
        System.out.print("Please enter third number: ");
        int num3= scanner.nextInt();

        if (num1!=num2 && num2!=num3){
           int max=(num1>num2 && num1>num3)?num1:(num2>num1&& num2>num3)?num2:num3;
            System.out.println("The highest number is "+max);
        }else{
            System.out.println("Please do not enter equal numbers.");
        }

    }
}
