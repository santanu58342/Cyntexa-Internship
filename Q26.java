public class Q26{
    public static int convertBinarytoOctal(long binaryNumber){
        int octalNumber=0,decimalNumber=0,i=0;
        while(binaryNumber!=0){
            decimalNumber+=(binaryNumber%10)*Math.pow(2,i);
            ++i;
            binaryNumber /= 10;
        }
        i=1;
        while (decimalNumber!=0){
            octalNumber+=(decimalNumber % 8) * i;
            decimalNumber/=8;
            i*=10;
        }
        return octalNumber;
    }
    public static void main(String[] args) {
        long binary = 101010;
        int octal = convertBinarytoOctal(binary);
        System.out.print("octal of "+binary+" is "+octal);
    }
}