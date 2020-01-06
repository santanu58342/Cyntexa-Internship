public class Q19 {
    public static void main(String[] args) {
        int a=30,b=45;
        for(int i=a;i>0;i--){
            if(a%i==0 && b%i==0){
                System.out.println("Gcd of 2 numbers is "+i);
                break;
            }
        }
    }
}