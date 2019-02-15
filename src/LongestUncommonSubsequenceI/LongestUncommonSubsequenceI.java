package LongestUncommonSubsequenceI;

public class LongestUncommonSubsequenceI {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a = "aba";
        String b = "cdc";
        System.out.println(solution.findLUSlength(a, b));
    }
}

class Solution {
    int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        return a.length() > b.length() ? a.length() : b.length();
    }
}