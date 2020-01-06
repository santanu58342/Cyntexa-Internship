import java.util.Arrays;
import java.util.*;
public class Q32 {
    public static void main(String[] args) {
        int []arr={9,9,8,8,8,5,4,4,1,3,3,3,3,2};
        int c=0;
        Arrays.sort(arr);
        HashMap<Integer,Integer> values=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if (values.containsKey(arr[i]))
                values.put(arr[i], values.get(arr[i])+1);
            else
                values.put(arr[i], 1);
        }
        System.out.println("frequency of elements are:- "+values);
    }
}