package ShortestCompletingWord;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"step", "steps", "stripe", "stepple"};
        String licensePlate = "1s3 PSt";
        String[] words1 = {"looks", "pest", "stew", "show"};
        String licensePlate1 = "1s3 456";
        System.out.println(solution.shortestCompletingWord(licensePlate1,words1));
    }
}

class Solution {
    String shortestCompletingWord(String licensePlate, String[] words) {
        String ans = "";
        licensePlate=licensePlate.toLowerCase();
        for (String word : words) {
            StringBuffer sb = new StringBuffer(word.toLowerCase());
            boolean find = true;
            for (int index = 0; index < licensePlate.length(); index++) {
                if (Character.isLetter(licensePlate.charAt(index))) {
                    if (sb.indexOf(String.valueOf(licensePlate.charAt(index))) < 0) {
                        find = false;
                        break;
                    } else
                        sb.deleteCharAt(sb.indexOf(String.valueOf(licensePlate.charAt(index))));
                }
            }
            if (find) {
                if (ans.equals(""))
                    ans = word;
                else if (word.length() < ans.length())
                    ans = word;
            }
        }
        return ans;
    }
}
