package KClosestPointsOrigin;

import java.util.*;

public class KClosestPointsOrigin {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a1 = {{1, 3}, {-2, 2}};
        int[][] a2 = {{3, 3}, {5, -1}, {-2, 4}};
        int K1 = 1;
        int K2 = 2;
        int[][] ans = solution.kClosest(a2, K2);
        for (int[] an : ans) {
            for (int i : an) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    int[][] kClosest(int[][] points, int K) {
        Map<Integer, Double> diss = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            double dis = 0.0d;
            for (int j = 0; j < points[i].length; j++)
                dis = dis + Math.pow(points[i][j], 2);
            diss.put(i, dis);
        }

        Double[] valuesArray = new Double[points.length];
        int index = 0;
        for (Double value : diss.values()) {
            valuesArray[index] = value;
            index++;
        }
        Arrays.sort(valuesArray);

        boolean over = false;
        int found = 0;
        int[][] ans = new int[K][points[0].length];

        for (int i = 0; i < K; i++) {
            for (Map.Entry<Integer, Double> entry : diss.entrySet()) {
                if (valuesArray[i] == entry.getValue()) {
                    ans[found] = points[entry.getKey()];
                    found++;
                    if (found == K) {
                        over = true;
                        break;
                    }
                }
            }
            if (over)
                break;
        }
        return ans;
    }
}
