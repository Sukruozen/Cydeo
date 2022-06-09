package day14;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //2. ask the user to enter a word. if the word ends with "ly", print "really???" ,
        // otherwise, print "never mind"
        System.out.println("Enter a word, i will know if it ends with \"ly\"");
        String word=input.next();
        boolean ly=word.indexOf("ly")==(word.length()-2);
        if(ly){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }input.close();
    }
}
