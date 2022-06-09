package day06;

public class Birthday {
    public static void main(String[]args){
        String name="Ahmet";
        int birthDay= 25;
        String birthMonth= "April";
        int birthYear = 1996;

        String greeting=name + " was born on "+
                birthMonth+'/'+birthDay+'/'+birthYear;
        System.out.println(greeting);
        String bookName= "The rich dad and the poor dad";
        System.out.println("My favourite book is" +"\"" +bookName+"\"");


    }
}
