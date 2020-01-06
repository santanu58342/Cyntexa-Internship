public class Q45 {
    public static String remove_duplicate(String s){
        String str=new String();
        int len=s.length();
        for (int i = 0; i < len; i++){
            char c=s.charAt(i);
            if(str.indexOf(c) < 0)
                str =str+c;
        }
        return str;
    }
    public static void main(String[] args){
        String s = "  Hello world";
        System.out.println(remove_duplicate(s));
    }
}