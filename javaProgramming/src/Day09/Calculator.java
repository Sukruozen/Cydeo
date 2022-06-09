package Day09;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int num1= scanner.nextInt();
        System.out.print("Please enter second number : ");
        int num2= scanner.nextInt();
        //System.out.print("Please select one of operators : "+"\""+"+"+"\""+" \""+"-"+"\""+" \""+"*"+"\""+" \""+"/"+"\""+" : ");
        char operator= '/';
        //System.out.println("operator = " + operator);
        double result;
        if(operator=='+'|| operator=='-'|| operator=='*' || operator=='/') {
        result= (operator=='+')? num1+num2:(operator=='-')? num1-num2 :(operator=='*')? num1*num2: num1/num2;
            /*if(operator=='+'){
                result=num1+num2;
            }else if (operator=='-'){
                result=num1-num2;
            } else if (operator=='*') {
                result=num1*num2;
            } else {
                result=num1/num2;
            }*/
            System.out.println(""+num1+operator+num2+ " is equal to = " + result);
        } else {
            System.out.println("Please enter valid operation symbol");
        }
    }
}
