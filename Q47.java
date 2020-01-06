import java.util.*;

public class Q47 {
    public static int solution(int n){
        int temp=0,c=0,flag=0,fs=0;
        String b=Integer.toBinaryString(n);
        ArrayList<Character> a1=new ArrayList<Character>();
        for(int i=0;i<b.length();i++)
            a1.add(b.charAt(i));
        System.out.println(a1);
        int start = 0;
        for(int i=0;i<a1.size();++i){
            if(a1.get(i)!='1')
                flag=1;
        }
        if(flag!=0) {
            for (int i = 0; i < a1.size(); ++i) {
                if (i == 0 && a1.get(i) != '1') {
                    c = 0;
                    break;
                }
                if(a1.get(i) == '1')
                    start=i;
                if (i < a1.size() - 1 && a1.get(i) != a1.get(i + 1) && a1.get(i) != '1') {
                    temp = counting(a1, start, i);
                    start = i+1;
                    if (temp > c)
                        c = temp;
                }
                if (i == a1.size() - 1 && start != i) {
                    if (i == a1.size() - 1 && a1.get(i) != '1' && c == 0) {
                        c = temp;
                        break;
                    } else if (i == a1.size() - 1 && a1.get(i) != '1' && c > 0) {
                        break;
                    }
                    else {
                        temp = counting(a1, start, i);
                        if (temp > c)
                        c = temp;
                    }
                }
            }
        }
        return c;
    }
    public static int counting(ArrayList<Character> list,int start,int end) {
        int l=0;
        for(int i=start;i<end;i++){
            l++;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:- ");
        int n=sc.nextInt();
        int r=solution(n);
        System.out.println("maximum binary gap is "+r);
    }
}