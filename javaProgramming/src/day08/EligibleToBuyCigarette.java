package day08;

import java.util.Scanner;

public class EligibleToBuyCigarette {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter your age :");
        byte age= scanner.nextByte();

        boolean isEligibleToBuyCigarettes= age>=18;
        if (isEligibleToBuyCigarettes){
            System.out.println("You have the right to buy cigarettes, though i advise not to!");
        } else {
            System.out.println("You cannot buy cigarettes!");
        }
    }
}
