package day10;

import java.util.Scanner;

public class Loans {
    public static void main(String[]args){
        /*
        6. Create a class called Loans, Given two variables salary and credit score,
         use those given info to determine if you can get a loan.
                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
              NOTE: MUST USE TERNARY.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your salary: ");
        int salary=scanner.nextInt();
        System.out.print("Please enter credit score: ");
        int creditScore= scanner.nextInt();
        String Loan=(salary>60000)?(creditScore>650)?"Loan approved":"Loan Denied":"Loan Denied";
        System.out.println(Loan);
    }
}
