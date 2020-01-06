import java.util.*;
public class Q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:- ");
        int n=sc.nextInt();
        int t1 = 0,t2=1,i=0;
        System.out.print("fibonacci series upto " +n+ ": ");
        while (i<n){
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1=t2;
            t2=sum;
            i++;
        }
    }
}