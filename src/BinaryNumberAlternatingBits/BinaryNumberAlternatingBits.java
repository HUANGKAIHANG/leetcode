package BinaryNumberAlternatingBits;

public class BinaryNumberAlternatingBits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hasAlternatingBits(5));
        System.out.println(solution.hasAlternatingBits(7));
        System.out.println(solution.hasAlternatingBits(11));
        System.out.println(solution.hasAlternatingBits(10));
    }
}

class Solution {
    boolean hasAlternatingBits(int n) {
        String b = Integer.toBinaryString(n);
        for (int i = 0; i < b.length()-1; i++) {
            if (b.charAt(i)==b.charAt(i+1))
                return false;
        }
        return true;
    }
}
