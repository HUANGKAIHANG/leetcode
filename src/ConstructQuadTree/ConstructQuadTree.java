package ConstructQuadTree;

public class ConstructQuadTree {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0}};
        System.out.println(solution.construct(grid));
    }
}

class Solution {
    Node construct(int[][] grid) {
        Node node;
        int first = grid[0][0];
        boolean ifLeaf = true;
        for (int[] ints : grid) {
            for (int anInt : ints) {
                if (anInt != first) {
                    ifLeaf = false;
                    break;
                }
            }
        }
        if (ifLeaf) {
            boolean val = first == 1;
            node = new Node(val, true, null, null, null, null);
        } else {
            int half = grid.length / 2;
            int[][] topLeft = new int[half][half];
            int[][] topRight = new int[half][half];
            int[][] bottomLeft = new int[half][half];
            int[][] bottomRight = new int[half][half];
            for (int i = 0; i < half; i++)
                System.arraycopy(grid[i], 0, topLeft[i], 0, half);
            for (int i = 0; i < half; i++)
                System.arraycopy(grid[i], half, topRight[i], 0, half);
            for (int i = 0; i < half; i++)
                System.arraycopy(grid[i + half], 0, bottomLeft[i], 0, half);
            for (int i = 0; i < half; i++)
                System.arraycopy(grid[i + half], half, bottomRight[i], 0, half);
            node = new Node(true, false, construct(topLeft), construct(topRight), construct(bottomLeft), construct(bottomRight));
        }
        return node;
    }
}