package HammingDistance;

public class HammingDistance {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x = 1;
        int y =4;
        System.out.println(solution.hammingDistance(x,y));
    }
}

class Solution {
    int hammingDistance(int x, int y) {
        int count = 0;
        if (x>y){
            int temp = x;
            x = y;
            y = temp;
        }
        String xBinary = Integer.toBinaryString(x);
        String yBinary = Integer.toBinaryString(y);
        int yIndex = yBinary.length()-1;
        for (int i = xBinary.length()-1; i >= 0; i--) {
            if (xBinary.charAt(i)!=yBinary.charAt(yIndex))
                count++;
            yIndex--;
        }
        for (int i = yIndex;i>=0;i--){
            if (yBinary.charAt(i)=='1')
                count++;
        }
        return count;
    }
}
