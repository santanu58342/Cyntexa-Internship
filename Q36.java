import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int matrix[][] = new int[rows][cols];
        int trans[][] = new int[rows][cols];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                trans[j][i] = matrix[i][j];
        }
        System.out.print("Result matrix is \n");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                System.out.print(trans[i][j]+" ");
            System.out.print("\n");
        }
    }
}