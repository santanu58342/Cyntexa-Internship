public class Q2 {
    public static void main(String args[]) {
        int x = 4, y = 8, r = 1;
        for (int i = 1; i <= y; i++)
            r = r * x;
        System.out.println(x+"^"+y+" = "+r);
    }
}