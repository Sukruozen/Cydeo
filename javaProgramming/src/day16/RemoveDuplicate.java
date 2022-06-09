package day16;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Please enter a word:");

        String word=s.nextLine().trim();
        String duplicatesRemoved="";
        for (int i = 0; i <word.length() ; i++) {

            duplicatesRemoved=(!duplicatesRemoved.contains(""+word.charAt(i)))?
                duplicatesRemoved+=word.charAt(i):duplicatesRemoved;
            }
        System.out.println(duplicatesRemoved);
        }
    }

