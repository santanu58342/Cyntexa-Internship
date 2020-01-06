import java.util.Scanner;

public class Q16{
    public static int swap(int input) {
        String inputString = String.valueOf(input);
        String outputString;
        if (inputString.length()==1){
            outputString=inputString;
        }
        else{
            char firstChar=inputString.charAt(0);
            char lastChar=inputString.charAt(inputString.length()-1);
            String remaining = inputString.substring(1,inputString.length()-1);
            outputString=lastChar+remaining+firstChar;
        }
        int output=Integer.parseInt(outputString);
        return output;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int input=scanner.nextInt();
        int output=swap(input);
        System.out.println(output);
    }
}