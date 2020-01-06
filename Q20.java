public class Q20 {
    public static void main(String[] args) {
        int n=10,f=0,sum=0;
        System.out.println("sum of prime numbers is:- ");
        for(int i=2;i<=n;i++){
            for(int j=2;j<i;j++){
                if(i%j==0 && i!=j) {
                    f = 1;
                    break;
                }
            }
            if(f==1)
                f=0;
            else
                sum=sum+i;
        }
        System.out.println(sum);
    }
}
