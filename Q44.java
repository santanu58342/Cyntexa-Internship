import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q44 {
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
        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
        int maxCount = 0;
        char maxChar = 0;
        for (Map.Entry<Character, Integer> entry : entrySet){
            if (entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        System.out.println("Maximum occurring char and its count is ");
        System.out.println(maxChar+" : "+maxCount);
    }
}