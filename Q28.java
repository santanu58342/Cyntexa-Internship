public class Q28 {
    public static void main(String[] args) {
        String hex="11110";
        int i=Integer.parseInt(hex,2);
        String hexString=Integer.toHexString(i);
        System.out.println("Hexa decimal: "+hexString);
    }
}