import java.util.HashMap;

public class Q43 {
    public static void main(String[] args) {
        String s="Hello world";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = s.replaceAll("\\s", "").toCharArray();
        for(int i=0;i<charArray.length;i++){
            if (charCountMap.containsKey(charArray[i]))
                charCountMap.put(charArray[i], charCountMap.get(charArray[i])+1);
            else
                charCountMap.put(charArray[i], 1);
        }
        System.out.println("frequency of characters are "+charCountMap);
    }
}
