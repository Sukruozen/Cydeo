package day10;

import java.util.Scanner;

public class GradeLevel {
    public static void main(String[]args){
        /*
         Create a class called GradeLevel, Given a number(byte) grade level determine and
         print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    For Any Other grade: Invalid grade level given
            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your age (between 1-18): ");
        byte grade= scanner.nextByte();
        String school="";
        if(grade<19 && grade>0){
            school=(grade<6)? "Elementary school":(grade<9 && grade>5)? "Middle school" :
                    (grade<13 && grade>8)?"High school": (grade<17 && grade>12)?"College":
                    "Grad School";
        } else{
            System.out.println("Please enter valid age between 1-18");
        }
        System.out.println("You should be attending "+school);
    }
}
