import java.util.*;

public class Q12 {
    public static void main(String argc[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount:- ");
        int amount = sc.nextInt();
        if(amount<1)
            System.out.println("Invalid amount");
        else {
            int[] notes = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};
            int[] noteCounter = new int[9];
            for (int i = 0; i < 9; i++) {
                if (amount >= notes[i]) {
                    noteCounter[i] = amount / notes[i];
                    amount = amount - noteCounter[i] * notes[i];
                }
            }
            for (int i = 0; i < 9; i++) {
                if (noteCounter[i] != 0)
                    System.out.println(notes[i] + " - " + noteCounter[i]);
            }
        }
    }
}