import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days:- ");
        int n=sc.nextInt();
        if(n>0) {
            int years = (n / 365);
            int weeks = (n % 365) / 7;
            n = (n % 365) % 7;
            System.out.println("Years= " + years);
            System.out.println("Weeks = " + weeks);
            System.out.println("Days  = " + n);
        }
        else
            System.out.println("days are invalid");
    }
}