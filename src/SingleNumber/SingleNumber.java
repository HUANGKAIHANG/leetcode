package SingleNumber;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a1 = {2, 2, 1};
        int[] a2 = {4, 1, 2, 1, 2};
        System.out.println(solution.singleNumber(a1));
        System.out.println(solution.singleNumber(a2));
    }
}

class Solution {
    int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            if (set.contains(num))
                set.remove(num);
            else
                set.add(num);
        }
        return (int) set.toArray()[0];
    }
}