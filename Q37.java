import java.util.Scanner;

public class Q37 {
    public static int determinant(int a[][], int n){
        int det=0,sign=1,p=0,q=0;
        if(n==1)
            det=a[0][0];
        else{
            int b[][] = new int[n-1][n-1];
            for(int x = 0 ; x < n ; x++){
                p=0;q=0;
                for(int i = 1;i < n; i++){
                    for(int j = 0; j < n;j++){
                        if(j != x){
                            b[p][q++] = a[i][j];
                            if(q % (n-1) == 0){
                                p++;
                                q=0;
                            }
                        }
                    }
                }
                det=det + a[0][x]*determinant(b, n-1)*sign;
                sign=-sign;
            }
        }
        return det;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2;
        int cols = 2;
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements :- ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
        }
        System.out.println("Determinant of the matrix is "+determinant(matrix,2));
    }
}