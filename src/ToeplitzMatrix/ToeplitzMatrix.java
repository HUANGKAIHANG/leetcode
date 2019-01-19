package ToeplitzMatrix;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        int[][] matrix2 = {{1, 2}, {2, 2}};
        System.out.println(solution.isToeplitzMatrix(matrix));
        System.out.println();
        System.out.println(solution.isToeplitzMatrix(matrix2));
    }
}

class Solution {
    boolean isToeplitzMatrix(int[][] matrix) {
        int h = matrix.length;
        int w = matrix[0].length;
        boolean ans = true;
        int currentI, currentJ;

        for (int i = h - 1; i >= 0; i--) {
            currentI = i;
            currentJ = 0;
            ans = isAns(matrix, h, w, currentI, currentJ);
            if (!ans)
                break;
        }

        if (ans) {
            for (int j = 1; j < w; j++) {
                currentI = 0;
                currentJ = j;
                ans = isAns(matrix, h, w, currentI, currentJ);
                if (!ans)
                    break;
            }
        }
        return ans;
    }

    private boolean isAns(int[][] matrix, int h, int w, int currentI, int currentJ) {
        int current;
        current = matrix[currentI][currentJ];
        currentI++;
        currentJ++;
        boolean ans = true;

        while (currentI < h && currentI >= 0 && currentJ < w && currentJ >= 0) {
            if (current != matrix[currentI][currentJ]) {
                ans = false;
                break;
            }
            currentI++;
            currentJ++;
        }
        return ans;
    }
}

//每条对角线上的元素 纵坐标-横坐标恒定，可作为map的key，两个for循环嵌套判定即可，出现key一样值冲突则为false