package JewelsAndStones;

public class JewelsAndStones {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String J1="aA";
        String S1="aAAbbbb";
        int count = solution.numJewelsInStones(J1,S1);
        System.out.println(count);
        String J2="z";
        String S2="ZZ";
        count = solution.numJewelsInStones(J2,S2);
        System.out.println(count);
    }
}

class Solution{
    int numJewelsInStones(String J, String S) {
        char[] ss = S.toCharArray();
        int count = 0;
        for (char s : ss) {
            if (J.contains(String.valueOf(s))) {
                count++;
            }
        }
        return count;
    }
}
