package GoatLatin;

public class GoatLatin {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "I speak Goat Latin";
        String s2 = "The quick brown fox jumped over the lazy dog";
        System.out.println(solution.toGoatLatin(s));
        System.out.println(solution.toGoatLatin(s2));
    }
}

class Solution {
    String toGoatLatin(String S) {
        StringBuffer sb = new StringBuffer();
        String[] sbs = S.split(" ");
        for (int i = 0; i < sbs.length; i++) {
            char first = sbs[i].toLowerCase().charAt(0);
            if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u')
                sbs[i] = sbs[i] + "ma";
            else
                sbs[i] = sbs[i].substring(1) + sbs[i].substring(0, 1) + "ma";
            for (int j = 0; j <= i; j++)
                sbs[i] = sbs[i] + "a";
            if (i == sbs.length - 1)
                sb.append(sbs[i]);
            else
                sb.append(sbs[i]).append(" ");
        }
        return sb.toString();
    }
}
