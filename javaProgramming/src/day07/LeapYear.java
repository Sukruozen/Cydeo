package day07;

public class LeapYear {
    public static void main(String[] args) {
        int year=2019;
        boolean leapYear= year%4==0;
        if(leapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
