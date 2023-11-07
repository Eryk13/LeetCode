import java.util.*;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {

//        HashSet<Character> result = new HashSet<>();
//        char[] chars = s.toCharArray();
//        for(int i=0; i<chars.length; i++) {
//            Set<Character> temp = new HashSet<>();
//            for(int j=i; j<chars.length ;j++) {
//                if(temp.contains(chars[j])){
//                    if(temp.size() > result.size()) {
//                        result.clear();
//                        result.addAll(temp);
//                    }
//                    break;
//                }
//                temp.add(chars[j]);
//            }
//        }
//        return result.size();
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int len = 0;
        int n = s.length();

        while(right < n){

            if(map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }

    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("abcabcbb"); //3 abc
        int result2 = lengthOfLongestSubstring("bbbbb"); //1 b
        System.out.println(result);
        System.out.println(result2);

    }
}
