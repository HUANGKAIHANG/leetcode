package IslandPerimeter;

public class IslandPerimeter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println(solution.islandPerimeter(grid));
    }
}

class Solution {
    int islandPerimeter(int[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int p = 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1)
                        p--;
                    if (i + 1 < grid.length && grid[i + 1][j] == 1)
                        p--;
                    if (j - 1 >= 0 && grid[i][j - 1] == 1)
                        p--;
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 1)
                        p--;
                    ans = ans + p;
                }
            }
        }
        return ans;
    }
}