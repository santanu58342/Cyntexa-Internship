import java.util.Scanner;
public class Q38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[3][3];
        int status=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j && a[i][j]!=1){
                    status=1;
                    break;
                }
                if ((i!=j && a[i][j]!=0)){
                    status=1;
                    break;
                }
            }
        }
        if(status==0){
            System.out.println("Symmetric matrix");
        }
        else
            System.out.println("Not symmetric matrix");
    }
}
