import java.util.*;
public class Q50 {
    public static int solution(int [] a){
        int r=-1;
        int f=0;
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j< a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                f = 1;
            }
            if (f == 1) {
                f = 0;
                continue;
            } else
                break;
        }
        int first=a[0];
        int last=a[a.length-1];
        int c1=0,c2=0,a1=0,b1=0;
        for(int i=0,j=first;i<a.length;i++,j++){
            if(a[i]!=j) {
                a1=j;
                break;
            }
            c1++;
        }
        for(int i=a.length-1,j=last;i>=0;i--,j--){
            if(a[i]!=j) {
                b1=j;
                break;
            }
            c2++;
        }
        if(a1==b1)
            r=a1;
        else{
            if(c1<c2)
                r=b1;
            if(c1>c2)
                r=a1;
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        System.out.println("Enter Range of array:- ");
        N=sc.nextInt();
        System.out.println("Enter elements:- ");
        int []a=new int[N];
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        int v=solution(a);
        if(v==-1){
            System.out.println("no missing elements");
        }
        else
            System.out.println("Missing element is "+v);
    }
}