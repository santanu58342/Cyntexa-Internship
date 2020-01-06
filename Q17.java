public class Q17 {
    public static void main(String[] args) {
        int n=121,l=0,r;
        r=n;
        while(r!=0){
            l=l*10+(r%10);
            r=r/10;
        }
        if(l==n)
            System.out.println("number is palindrome");
        else
            System.out.println("No palindrome");
    }
}
