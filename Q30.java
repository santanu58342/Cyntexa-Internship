import java.util.Scanner;

public class Q30 {
    public static void read(int []a,int n){
        if(n==a.length)
            return ;
        else
            read(a,n+1);
        Scanner sc=new Scanner(System.in);
        a[n]=sc.nextInt();
    }
    public static void print(int a[],int n){
        if(n==a.length)
            return ;
        else
             print(a,n+1);
        System.out.println(a[n]);
    }
    public static void main(String[] args) {
        int []arr=new int[10];
        read(arr,0);
        print(arr,0);
    }
}
