package SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.selfDividingNumbers(1, 22));
    }
}

class Solution {
    List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> sdn = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (String.valueOf(i).contains("0"))
                continue;
            boolean valid = true;
            for (char c : String.valueOf(i).toCharArray())
                if (i % (c - '0') != 0) {
                    valid = false;
                    break;
                }
            if (valid)
                sdn.add(i);
        }
        return sdn;
    }
}
