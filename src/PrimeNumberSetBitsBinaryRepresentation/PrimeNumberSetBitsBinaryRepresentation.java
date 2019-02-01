package PrimeNumberSetBitsBinaryRepresentation;

public class PrimeNumberSetBitsBinaryRepresentation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int L = 6;
        int R = 10;
        int L1 = 10;
        int R1 = 15;
        System.out.println(solution.countPrimeSetBits(L, R));
        System.out.println(solution.countPrimeSetBits(L1, R1));
    }
}

class Solution {
    int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for (int i = L; i <= R; i++) {
            String b = Integer.toBinaryString(i);
            int n = b.length() - b.replaceAll("1", "").length();
            if (isPrime(n))
                ans++;
        }
        return ans;
    }

    private boolean isPrime(int n) {
        boolean prime = false;
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0)
                break;
        }
        if (i == n)
            prime = true;
        return prime;
    }
}