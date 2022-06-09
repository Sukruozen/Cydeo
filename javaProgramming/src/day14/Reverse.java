package day14;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int length=word.length();
        String result="";
        switch(length){
            case 0: case 1:case 2:case 3:case 4:
                result="Too short!";
                break;
            case 5:
                result=""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
                break;
            default:result="Too long!";

                System.out.println(result);


        }

    }
}
