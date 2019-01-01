package ToLowerCase;

public class ToLowerCase {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.toLowerCase("Hello"));
        System.out.println(solution.toLowerCase("here"));
        System.out.println(solution.toLowerCase("LOVELY"));
    }
}

class Solution {
    String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
