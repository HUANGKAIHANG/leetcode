package ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "hello";
        String s2 = "A man, a plan, a canal: Panama";
        System.out.println(solution.reverseString(s1));
        System.out.println(solution.reverseString(s2));
    }
}

class Solution {
    String reverseString(String s) {
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length / 2; i++) {
            char temp = cs[i];
            cs[i] = cs[cs.length - 1 - i];
            cs[cs.length - 1 - i] = temp;
        }
        return String.valueOf(cs);
    }
}
