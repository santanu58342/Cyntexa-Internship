import java.util.Scanner;

public class Q9{
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        System.out.printf("Enter number :- ");
        int number=console.nextInt();
        if( (number&1)==0)
            System.out.printf(number+" is even");
        else
            System.out.printf(number+" is odd");
    }
}