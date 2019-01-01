package SortArrayByParity;

import java.util.Arrays;
import java.util.LinkedList;

public class SortArrayByParity {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] values = {3, 1, 2, 4};
        System.out.println(Arrays.toString(solution.sortArrayByParity(values)));
    }
}

class Solution {
    int[] sortArrayByParity(int[] A) {
        LinkedList<Integer> link = new LinkedList<>();
        for (int i1 : A) {
            if (i1 % 2 == 0)
                link.addFirst(i1);
            else
                link.addLast(i1);
        }
        return link.stream().mapToInt(i -> i).toArray();
    }
}
