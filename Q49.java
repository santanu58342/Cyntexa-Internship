import java.util.Scanner;
public class Q49 {
    public static int solution(int X,int Y,int D){
        int count=0;
        while(X<=Y) {
            if(X==Y)
                break;
            count++;
            X=X+D;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner((System.in));
        System.out.println("enter value of X:- ");
        int x=sc.nextInt();
        System.out.println("enter value of Y:- ");
        int y=sc.nextInt();
        System.out.println("enter value of D:- ");
        int d=sc.nextInt();
        if(d<=0 || x<0 || y<=0)
            System.out.println("Invalid input");
        else {
            int c = solution(x, y, d);
            System.out.println(c);
        }
    }
}