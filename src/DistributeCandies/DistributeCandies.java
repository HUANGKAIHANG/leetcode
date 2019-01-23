package DistributeCandies;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] c = {1, 1, 2, 2, 3, 3};
        int[] c1 = {1, 1, 2, 3};
        System.out.println(solution.distributeCandies(c));
        System.out.println(solution.distributeCandies(c1));
    }
}

class Solution {
    int distributeCandies(int[] candies) {
        int need = candies.length / 2;
        Set<Integer> types = new HashSet<>();
        for (int candy : candies)
            types.add(candy);
        return types.size() - need >= 0 ? need : types.size();
    }
}