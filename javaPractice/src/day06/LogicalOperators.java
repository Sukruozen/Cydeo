package day06;

public class LogicalOperators {
    public static void main(String[] args) {
        String car="BMW";
        int price=60000;
        int myCash=55000;
        boolean isExpensive=price>myCash;
        boolean isCheap=price<myCash;

        if (isExpensive && myCash>50000) {
            System.out.println("I cannot afford this car");}
            else{
                System.out.println("I can buy this car");
            }
        }
    }
