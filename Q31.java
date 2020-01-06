public class Q31 {
    public static int recur(int []a,int i){
        if(i<=0)
            return 0;
        else
            return (recur(a,i-1)+a[i-1]);
    }
    public static void main(String[] args) {
        int a[]={3,6,9,8,5,2,1,4,7};
        System.out.println(recur(a,a.length));
    }
}
