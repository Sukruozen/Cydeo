package Day08;

public class MonthsIf {
    public static void main(String[] args) {
        int number=11;
        boolean has28Days = number==2;
        boolean has30Days = number==4 || number==6 || number==9 || number==11;
        boolean has31Days = !has28Days && !has30Days;

    }
}
