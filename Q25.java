import java.util.*;

public class Q25 {
    public static String find(StringBuffer str){
        int n = str.length();
        int i;
        for (i=n-1;i>=0;i--)
            if(str.charAt(i)=='1')
                break;
        if (i==-1)
            return "1"+str;
        for (int k=i-1;k>=0;k--){
            if (str.charAt(k)=='1')
                str.replace(k,k+1,"0");
            else
                str.replace(k,k+1,"1");
        }
        return str.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number:- ");
        StringBuffer str=new StringBuffer();
        str.append(sc.nextLine());
        System.out.println(find(str));
    }
}