import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int matrix1[][] = new int[rows][cols];
        int matrix2[][] = new int[rows][cols];
        int matrix3[][] = new int[rows][cols];
        System.out.println("Enter the elements for matrix 1:- ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = sc.nextInt();
        }
        System.out.println("Enter the elements for matrix 2:- ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++)
                    matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }
}