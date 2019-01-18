package KeyboardRow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] inputs = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(solution.findWords(inputs)));
    }
}

class Solution {
    String[] findWords(String[] words) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            int rowNumber;
            if (row1.contains(String.valueOf(word.charAt(0))))
                rowNumber = 1;
            else if (row2.contains(String.valueOf(word.charAt(0))))
                rowNumber = 2;
            else
                rowNumber = 3;
            int j;
            for (j = 1; j < word.length(); j++) {
                if (rowNumber == 1) {
                    if (row2.contains(String.valueOf(word.charAt(j))) ||
                            row3.contains(String.valueOf(word.charAt(j))))
                        break;
                } else if (rowNumber == 2) {
                    if (row1.contains(String.valueOf(word.charAt(j))) ||
                            row3.contains(String.valueOf(word.charAt(j))))
                        break;
                } else {
                    if (row1.contains(String.valueOf(word.charAt(j))) ||
                            row2.contains(String.valueOf(word.charAt(j))))
                        break;
                }
            }
            if (j == word.length())
                ans.add(word);
        }
        return ans.toArray(new String[0]);
    }
}
