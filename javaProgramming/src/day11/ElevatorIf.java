package day11;

import java.util.Scanner;

public class ElevatorIf {
    public static void main(String[] args) {
        /*

	2. Create a class called Elevator. A variable named floorNumber is given,
	 write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"
			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Please choose floor:");
        int floorNumber= input.nextInt();
        String companies="";
        if (floorNumber==1||floorNumber==2||floorNumber==3){
            if(floorNumber==1){
                companies="Lobby, Verizon, Starbucks";
            } else if (floorNumber==2) {
                companies="Cybertech, NASA, Intelsat";
            } else{
                companies="Lyft, BofA, Stake house";
            }
            System.out.println("Floor "+floorNumber+" selected, companies "+companies);

        }else {
            System.out.println("Invalid Floor!");
        }
    }
}
