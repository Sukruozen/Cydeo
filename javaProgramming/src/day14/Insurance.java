package day14;
import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name=scan.next();
        System.out.println("Do you have a US driver license?");
        boolean hasL=scan.next().toLowerCase().equals("yes");
        if(!hasL){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter zip code:");
        int zipCode=scan.nextInt();
        premium=(zipCode==20910 ||zipCode==20740)?premium+60:
                (zipCode==22102 || zipCode==22103)? premium+30:
                        premium+50;
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership=scan.next();
        premium=(vehicleOwnership.trim().toLowerCase().equals("owned"))?premium+10:premium+20;
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage=scan.next().trim().toLowerCase();
        premium=(vehicleUsage.equals("business"))?premium+50:
                (vehicleUsage.equals("pleasure"))?premium +10:
                        (vehicleUsage.equals("commute"))?premium+20:premium;
        System.out.println("Days Driven to Work And/Or School");
        daysDrivenToWorkOrSchool=scan.nextInt();
        premium+=daysDrivenToWorkOrSchool*5;
        System.out.println("Miles Driven To Work And/Or School");
        milesToWorkOrSchool=scan.nextInt();
        premium+=milesToWorkOrSchool;
        System.out.println("How old are you?");
        int age=scan.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(1);
        }else if(age>16 && age<18){
            premium*=20;
        }else if(age>17 && age<22){
            premium*=6;
        }else if(age>21 && age<25){
            premium*=2;
        }
        System.out.println("Enter driving experience:");
        int drivingExperience=scan.nextInt();
        if(!(drivingExperience>0 || drivingExperience-age>=16)){
            System.out.println("Invalid data!");
            System.exit(2);
        }
        premium-=drivingExperience*5;
        System.out.println("Have you had any accidents in the last 5 years?");
        boolean accidental=scan.next().trim().toLowerCase().equals("yes");
        if(accidental){
            System.out.println("How many?");
            accidentsAmount=scan.nextInt();
            premium*=accidentsAmount*1.2;
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        boolean notInsured=scan.next().trim().toLowerCase().equals("no");
        premium=(notInsured)?premium*2:premium;
        System.out.println("What is the highest level of education you have completed?");
        education=scan.next().trim().toLowerCase();
        premium=(education.equals("phd") || education.equals("masters")||education.equals("bachelors"))?premium-premium/20:(education.equals("doctors"))?premium-premium/10:(education.equals("less than high school"))?premium+premium/20:premium;
        System.out.println(name+", here's your quote!\nStart your Policy Today For: $"+premium);
        referenceNumber=(name.substring(0,2)+age+name.substring(name.length()-2,name.length())+zipCode+education).toUpperCase();
        System.out.println("Reference number: "+referenceNumber);



    }

}


