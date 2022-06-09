package day13;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        /*1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".Otherwise, reverse this word and print out result into the console.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word with five letters:");
        String word=input.next();
        input.close();
        String result="";
        /*switch (word.length()){
            case 1: case 2: case 3: case 4:result="Too short!";
            break;
            case 5:result=""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
            break;
            default:result="Too long!";
        }
        System.out.println(result);*/
        if(word.length()<5){
            result="Too short";
        }else if(word.length()>5){
            result="Too long";
        }else {
            result=""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        }

        System.out.println(result);
    }
}
