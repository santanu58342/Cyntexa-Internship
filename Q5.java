import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter number:- ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        String s=Integer.toBinaryString(num);
        char []c=s.toCharArray();
        if(c[0]=='1')
            System.out.println("MSB of the number is set");
        else
            System.out.println("MSB of the number is not set");
    }
}