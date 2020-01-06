import java.util.*;

public class Q23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:- ");
        int n=sc.nextInt();
        for(int a=1;a<n;a++){
            int i,m,q,b,c,r,e,s;
            i=0;
            c=a;
            while(c>0){
                b=c%10;
                c=c/10;
                i++;
            }
            q=0;
            m=a;
            r=a;
            while(m>0){
                e=m%10;
                s=(int) Math.pow(e,i);
                q=q+s;
                m=m/10;
            }
            if(q==r)
                System.out.println(q);
        }
    }
}