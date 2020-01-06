import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int number = scanner.nextInt();
        Map<Integer, Integer> digitMap = new HashMap<Integer, Integer>();
        int remainder = 0;
        while (number > 0){
            remainder = number % 10;
            Integer count = digitMap.get(remainder);
            if (count == null) {
                digitMap.put(remainder, 1);
            } else {
                digitMap.put(remainder, ++count);
            }
            number = number / 10;
        }
        System.out.println("Frequency of digits are "+digitMap);
    }
}