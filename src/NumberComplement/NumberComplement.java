package NumberComplement;

public class NumberComplement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findComplement(5));
    }
}

class Solution {
    int findComplement(int num) {
        char[] complement = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < complement.length; i++)
            complement[i]=complement[i]=='0' ? '1':'0';
        return Integer.valueOf(String.valueOf(complement),2);
    }
}