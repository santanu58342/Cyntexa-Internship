import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter number:- ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if((num & 1)==1)
            System.out.println("LSB of the number is set");
        else
            System.out.println("LSB of the number is not set ");
    }
}