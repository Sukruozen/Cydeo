package Day09;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {
           /*
    4. Create a class called Character Identity, and write a program that can identify
    if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'   65-90 and 97 122  digit 48-57
		output:
			Special Character
		HINT: You may wanna check out the numbers of the chracters on ASCII table
     */
        char entry='W';
        String result="";
        if (entry<128 && entry>0){
            if(entry<91 && entry>64){
                result="CAPITAL LETTER";
            } else if (entry>96 && entry<123) {
                result="small letter";
            } else if (entry<58 && entry>47) {
                result="digit";
            }else {
                result="special character";
            }
        } else {
            System.out.println("Please enter a number between 0 and 128");
        }
        System.out.println(result);

    }

}
