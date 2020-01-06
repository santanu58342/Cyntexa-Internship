import java.util.Scanner;

public class Q40{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
        }
        boolean symmetric = true;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != matrix[j][i])
                    symmetric = false;
                    break;
            }
        }
        if(symmetric)
            System.out.println("matrix is symmetric");
        else
            System.out.println("matrix is not symmetric");
    }
}