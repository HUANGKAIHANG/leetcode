package ProjectionArea3DShapes;

public class ProjectionArea3DShapes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid1 = {{2}};
        int[][] grid2 = {{1, 2}, {3, 4}};
        int[][] grid3 = {{1, 0}, {0, 2}};
        int[][] grid4 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] grid5 = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        System.out.println(solution.projectionArea(grid1));
        System.out.println(solution.projectionArea(grid2));
        System.out.println(solution.projectionArea(grid3));
        System.out.println(solution.projectionArea(grid4));
        System.out.println(solution.projectionArea(grid5));
    }
}

class Solution {
    int projectionArea(int[][] grid) {
        int xy = 0, xz = 0, yz = 0;
        for (int i = 0; i < grid.length; i++) {
            int maxXZ = 0;
            int maxYZ = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != 0)
                    xy++;
                if (grid[i][j] > maxXZ)
                    maxXZ = grid[i][j];
                if (grid[j][i] > maxYZ)
                    maxYZ = grid[j][i];
            }
            xz = xz + maxXZ;
            yz = yz + maxYZ;
        }
        return xy + xz + yz;
    }
}
