import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q48 {
    public static int solution(int[] a){
        int result = 0,c=0,index;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a1: a){
            if(hm.containsKey(a1))
                hm.put(a1,hm.get(a1)+1);
            else
                hm.put(a1,1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue()<2) {
                result = entry.getKey();
                c++;
            }
        }
        if(c==1) {
            index = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == result)
                    index = i;
            }
        }
        else
            index=-1;
        return index;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range of elements(odd):- ");
        int r=sc.nextInt();
        int[] arr=new int[r];
        System.out.println("enter array elements:- ");
        for(int i=0;i<r;i++){
            arr[i]=sc.nextInt();
        }
        int ans=solution(arr);
        if(ans<0)
        System.out.println("input doesn't satisfies condition");
        else
        System.out.println("unpaired element "+(ans+1)+" has value "+arr[ans]+" and is unpaired.");
    }
}