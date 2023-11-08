import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int n = 0;
        while(n < s1.length() && n < s2.length()){
            if(s1.charAt(n) == s2.charAt(n)){
                n++;
                continue;
            }
            break;
        }
        return s1.substring(0, n);
    }
    public static void main(String[] args) {
        String[] arr1 = new String[] {"flower", "flow", "flight"};
        String[] arr2 = new String[] {"dog", "racecar", "car"};

        System.out.println(longestCommonPrefix(arr1));
        System.out.println(longestCommonPrefix(arr2));
    }
}
