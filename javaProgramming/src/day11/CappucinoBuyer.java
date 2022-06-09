package day11;

public class CappucinoBuyer {
    public static void main(String[] args) {
        /*

	1. Create a class called  CappuccinoBuyer. A variable named Size is given,
	write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:
						tall:   price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories
						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output should be "Invalid Size"
			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
         */
        String size="grande";
        double price=0;
        int calories=0;
        /* WITH IF STATEMENT
        if (size=="tall"||size=="grande" || size=="venti"){
            if(size=="tall") {
            price = 3.69;
            calories = 90;
            }else if(size=="grande"){
            price=3.99;calories=120;
            }else{
            price=4.29;
            calories=150;
        }
            System.out.println("Price is: $"+price+"\n"+calories+" calories");
    }else
        System.out.println("Invalid Size");
    */
    /*SWITCH STATEMENT;
    switch(size){

        case "tall":price=3.69; calories=90;
            System.out.println("price is $"+price+"\n"+calories+" calories");
            break;
        case "grande":price=3.99;calories=120;
            System.out.println("price is $"+price+"\n"+calories+" calories");
            break;
        case "venti":price=4.29;calories=150;
            System.out.println("price is $"+price+"\n"+calories+" calories");
            break;
        default:
            System.out.println("Invalid size");

    }*/
         if(size=="tall"||size=="grande"||size=="venti"){
            switch (size){
                case "tall":
                    price=3.69;calories=90;
                    break;
                case "grande":
                    price=3.99;calories=120;
                    break;
                default:
                    price=4.29;calories=150;
            }
            System.out.println("price is: $"+price+"\n"+calories+" calories");
        }else System.out.println("Invalid Size");
    }
}
