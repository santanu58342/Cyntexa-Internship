import java.util.*;

public class Q29 {
    public static int factorial(int n){
        int j,result=1;
        for(j=1;j<=n;j++)
            result=result*j;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter n:- ");
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            for(j=n+1;j>i;j--)
                System.out.print(" ");
            for(j=0;j<=i;j++)
                System.out.print(factorial(i)/(factorial(j)*factorial(i-j))+" ");
            System.out.println();
        }
    }
}
