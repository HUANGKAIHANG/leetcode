package SortArrayByParity2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SortArrayByParity2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(solution.sortArrayByParityII(nums)));
    }
}

class Solution {
    int[] sortArrayByParityII(int[] A){
        Queue<Integer> oddQueue = new LinkedList<>();
        Queue<Integer> evenQueue = new LinkedList<>();
        for (int i1 : A) {
            if (i1 % 2 == 0)
                evenQueue.add(i1);
            else
                oddQueue.add(i1);
        }
        int[] ans = new int[A.length];
        for (int i = 0; i < ans.length; i=i+2) {
            ans[i]=evenQueue.poll();
            ans[i+1]=oddQueue.poll();
        }
        return ans;
    }
}