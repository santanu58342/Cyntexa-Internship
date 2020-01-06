import java.util.*;

public class Q22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:- ");
        int n=sc.nextInt();
            int i,m,q,b,c,r,e,s;
            i=0;
            c=n;
            while(c>0){
                b=c%10;
                c=c/10;
                i++;
            }
            q=0;
            m=n;
            r=n;
            while(m>0){
                e=m%10;
                s=(int) Math.pow(e,i);
                q=q+s;
                m=m/10;
            }
            if(q==r)
                System.out.println("The number is armstrong");
    }
}