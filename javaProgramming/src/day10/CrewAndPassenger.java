package day10;

import java.util.Scanner;

public class CrewAndPassenger {
    public static void main(String[]args){
        /*2. Create a class called CrewAndPassangers, Given a number of people on the ship
         (int number), determine how many need to be crew members and how many can be passengers.
          Print how many of each type there should be.
                Total: 50  ====> 20 crew, 30 passengers Total: 75  ====> 25 crew, 50 passengers
        Total: 100 ====> 30 crew, 70 passengers Any other number of people on the ship is not valid
        NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
        */
        Scanner ship=new Scanner(System.in);
        System.out.print("Please enter how many people are aboard : ");
        int number= ship.nextInt();
        String aboard="";
        int crew=0,passenger=0;
        if(number ==50 || number==75 || number==100){
            crew =(number==50)?20 :(number==75)? 25 : 30;
            passenger=(number==50)?30 :(number==75)? 50 : 70;
        }else {
            System.out.println("invalid amount of number!");
        }
        System.out.println("There can be "+crew+" crew and "+passenger+" passenger aboard");
    }
}
