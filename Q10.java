public class Q10 {
    public static void main(String args[]){
        int a[]={8,4,2,7};
        int f=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]<a[j+1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
                    f=1;
            }
            if(f==1){
                f=0;
                continue;
            }
            else
                break;
        }
        System.out.println("2nd max value is "+a[1]);
    }
}