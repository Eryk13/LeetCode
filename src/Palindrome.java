//Given an integer x, return true if x is a palindrome, and false otherwise

public class Palindrome {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome(121));
        System.out.println(Palindrome.isPalindrome(-121));
        System.out.println(Palindrome.isPalindrome(10));
    }
}
