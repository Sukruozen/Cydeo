package day08;

import java.util.Scanner;

public class SchoolAge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your age: ");
        byte age= scanner.nextByte();
        boolean elementary= age<6 && age>1;
        boolean middleSchool= age<9 && age>5;
        boolean highSchool=age<13 && age>8;
        boolean college=age<17 && age>12;
        boolean gradSchool=age>16;
        String school;//added this to make the code cleaner
        if(elementary){
            //System.out.println(" you are at elementary school");
            school="elementary";
        } else if(middleSchool){
           // System.out.println(" you are at middle school");
            school="middle school";
        } else if (highSchool) {
            //System.out.println(" you are at high school");
            school="high school";
        } else if (college) {
            //System.out.println(" you are at college");
            school="college";
        } else{
            //System.out.println(" you are at grad school");
            school="grad school";
        }
        System.out.println("You are "+ school +" student");
    }
}
