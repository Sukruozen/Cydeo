package day13;

import java.util.Scanner;

public class EightthTask {
    public static void main(String[] args) {
        /*
        8. You are writing a code for the log-in function of the Cybertek Application,
         assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message
    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter username:");
        String username=input.next();
        System.out.println("Please enter password:");
        String password= input.next();
        String result=(username.equals("Cydeo")&&password.equals("WoodenSpoon"))?"Logged in":
                "Incorrect username or password";
        System.out.println(result);
    }
}
