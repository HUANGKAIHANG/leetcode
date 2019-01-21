package BinaryGap;

public class BinaryGap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.binaryGap(8));
    }
}

class Solution {
    int binaryGap(int N) {
        String b = Integer.toBinaryString(N);
        int maxD = 0;
        int frontIndex = b.indexOf("1");
        if (frontIndex != -1) {
            for (int i = 0; i < b.length(); i++) {
                if (b.charAt(i) == '1') {
                    maxD = i - frontIndex > maxD ? i - frontIndex : maxD;
                    frontIndex = i;
                }
            }
        }
        return maxD;
    }
}