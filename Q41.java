import java.util.*;

public class Q41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter line:- ");
        String s1=sc.nextLine();
        int c=1;
        s1=s1.trim();
        //String arr[];
        char[] a1=s1.toCharArray();
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
            if(a1[i]==' ' && a1[i+1]!=' ')
                c++;
        }
        //arr=s1.split(" ");
        System.out.println("Count of words are "+c);
    }
}