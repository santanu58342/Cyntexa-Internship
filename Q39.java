import java.util.HashMap;
import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int size=rows*cols;
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
        }
        HashMap<Integer, Integer> values = new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if (values.containsKey(matrix[i][j]))
                    values.put(matrix[i][j], values.get(matrix[i][j])+1);
                else
                    values.put(matrix[i][j], 1);
            }
        }
        if(values.containsKey(0) && values.get(0)>=(size/2)){
            System.out.println("Matrix is sparse");
        }
        else
            System.out.println("Matrix is not sparse");
    }
}
