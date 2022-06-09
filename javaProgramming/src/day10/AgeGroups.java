package day10;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[]args){
        /*
        4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )
             if age is negative or greater than 150, print invalid
             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age= scanner.nextInt();
        String group="";
        if (age<150 && age>0 ){
            group=(age<21)?"Teenager":(age<55 && age>=21)?"Adult":"Senior";
        }else {
            group="age is invalid!!!";
        }
        System.out.println(group);
    }
}
