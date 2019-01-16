package NumberLinesToWriteString;

import java.util.Arrays;

public class NumberLinesToWriteString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] width = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "bbbcccdddaaa";
        System.out.println(Arrays.toString(solution.numberOfLines(width, s)));
    }
}

class Solution {
    int[] numberOfLines(int[] widths, String S) {
        int lines = 1;
        int last = 0;
        for (int i = 0; i < S.length(); i++) {
            last = last + widths[S.charAt(i) - 97];
            if (last > 100) {
                lines++;
                last = widths[S.charAt(i) - 97];
            }
        }
        return new int[]{lines, last};
    }
}
