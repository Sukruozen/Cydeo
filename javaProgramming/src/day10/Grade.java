package day10;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        /*
        3. Create a class called Grade, a char variable named grade is given.
        write a program to print the following messages:
            'A': excellent  'B': great job  'C': good  'D': passed  'F': failed  other wise: invalid
            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
        char grade='C';
        String expl="";
        if(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F'){
            expl=(grade=='A')?"excellent":(grade=='B')?"great job":
                    (grade=='C')?"good":(grade=='D')?"passed":"failed";

        }else {
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade : "+expl);


    }
}
