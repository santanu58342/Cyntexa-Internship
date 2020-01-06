import java.util.ArrayList;
public class Q21 {
    public static void main(String[] args) {
        int n=18;
        ArrayList a=new ArrayList();
        for(int i=1;i<n;i++){
            if(n%i==0)
                a.add(i);
        }
        System.out.println("Pime factors of "+n+" is "+a);
    }
}
