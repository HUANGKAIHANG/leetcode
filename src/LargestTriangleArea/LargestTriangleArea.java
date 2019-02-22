package LargestTriangleArea;

public class LargestTriangleArea {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        int[][] points1 = {{1, 0}, {0, 0}, {0, 1}};
        System.out.println(solution.largestTriangleArea(points));
        System.out.println(solution.largestTriangleArea(points1));
    }
}

class Solution {
    double largestTriangleArea(int[][] points) {
        double area = 0d;
        for (int[] a : points) {
            for (int[] b : points) {
                for (int[] c : points) {
                    double temp = Math.abs(a[0] * b[1] + b[0] * c[1] + c[0] * a[1]
                            - a[0] * c[1] - c[0] * b[1] - b[0] * a[1]) * 0.5;
                    area = Math.max(temp, area);
                }
            }
        }
        return area;
    }
}