package SurfaceArea3DShapes;

public class SurfaceArea3DShapes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] g1 = {{2}};
        int[][] g2 = {{1, 2}, {3, 4}};
        int[][] g3 = {{1, 0}, {0, 2}};
        int[][] g4 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] g5 = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        System.out.println(solution.surfaceArea(g1));
        System.out.println(solution.surfaceArea(g2));
        System.out.println(solution.surfaceArea(g3));
        System.out.println(solution.surfaceArea(g4));
        System.out.println(solution.surfaceArea(g5));
    }
}

class Solution {
    int surfaceArea(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                area = area + 6 * grid[i][j];
                if (grid[i][j] >= 1)
                    area = area - 2 * (grid[i][j] - 1);
                if (i - 1 >= 0 && i - 1 < grid.length)
                    area = area - Math.min(grid[i][j], grid[i - 1][j]);
                if (i + 1 < grid.length)
                    area = area - Math.min(grid[i][j], grid[i + 1][j]);
                if (j - 1 >= 0 && j - 1 < grid[i].length)
                    area = area - Math.min(grid[i][j], grid[i][j - 1]);
                if (j + 1 < grid[i].length)
                    area = area - Math.min(grid[i][j], grid[i][j + 1]);
            }
        }
        return area;
    }
}