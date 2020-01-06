public class Q46 {
    public static void main(String args[]){
        String str1 = "  Hello   world  ";
        str1.trim();
        String noSpaceStr = str1.replaceAll("\\s", "");
        System.out.println(noSpaceStr);
    }
}