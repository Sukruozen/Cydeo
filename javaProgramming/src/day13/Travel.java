package day13;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int cost=0;
        int peoplecount=1;
        System.out.println("Do you have a valid passport?true/false:");
        boolean hasPass=input.nextBoolean();
        if(hasPass){
            cost=1000;
            System.out.println("Please enter the name of the country you are travelling to:");
            String countryName=input.next();
            System.out.println("Please enter the number of your bags:");
            byte bags= input.nextByte();
            cost+=bags*50;

            System.out.println("How many people are you travelling with?");
            peoplecount=input.nextInt();
            if(peoplecount<3){
                cost-=peoplecount*100;
            }else {
                cost-=300;
            }
            System.out.println("Enter the name of people you are travelling with:");
            input.nextLine();
            String buddies=input.nextLine();
            System.out.println("Your ticket is booked to "+countryName+". We have charged extra for the "+bags+" bags" +
                    " but you are travelling with "+buddies+" so we are giving a discount. Your total cost is $"+cost);


        }else{
            cost=200;
            System.out.println("Please enter when your passport has expired:");
            int expiration= 2022-input.nextInt();
            cost+=expiration*75;
            System.out.println("Which country are you planning to travel to?");
            String country2= input.next();
            System.out.println("Are you planning to travel next year?true/false");
            boolean nextYear=input.nextBoolean();
            if(nextYear){
                cost+=100;
            }else {
                cost-=50;
            }
            System.out.println("Looks like your password has been expired for "+expiration+" years, but not to worry we will" +
                    " get it ready for you to travel to "+country2+". Your total cost has come out to "+cost);


        }

    }
}
