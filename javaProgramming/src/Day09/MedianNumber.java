package Day09;

public class MedianNumber {
    public static void main(String[] args) {

        int a=10,b=15,c=12;
        boolean aIsMedian=((b<a && a<c) || (c<a && a<b));
        boolean bIsMedian=((a<b && b<c) || (c<b && b<a));
        boolean cIsMedian=((a<c && c<b) || (b<c && c<a));

        if(aIsMedian){

            System.out.println("a is the median number");
        }
        else if(bIsMedian){
            System.out.println("b is the median number");
        }
        else {
            System.out.println("c is the median number");
        }


    }
}
