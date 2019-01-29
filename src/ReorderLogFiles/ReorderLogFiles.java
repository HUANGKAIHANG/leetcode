package ReorderLogFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderLogFiles {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] logs = {"d 02", "2 5 3", "k r y", "6 srs", "x fp"};
        System.out.println(Arrays.toString(solution.reorderLogFiles(logs)));
    }
}

class Solution {
    String[] reorderLogFiles(String[] logs) {
        List<String> letter = new ArrayList<>();
        List<String> digit = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        for (String log : logs) {
            int index = log.indexOf(" ");
            if ((byte) log.charAt(index + 1) >= 48 && (byte) log.charAt(index + 1) <= 57)
                digit.add(log);
            else
                letter.add(log);
        }
        for (int i = 0; i < letter.size() - 1; i++) {
            for (int j = i + 1; j < letter.size(); j++) {
                int indexI = letter.get(i).indexOf(" ");
                int indexJ = letter.get(j).indexOf(" ");
                String logI = letter.get(i).substring(indexI);
                String logJ = letter.get(j).substring(indexJ);
                if (logI.compareTo(logJ) > 0) {
                    String temp = letter.get(i);
                    letter.set(i, letter.get(j));
                    letter.set(j, temp);
                } else if (logI.compareTo(logJ) == 0) {
                    String idI = letter.get(i).substring(0, indexI);
                    String idJ = letter.get(j).substring(0, indexJ);
                    if (idI.compareTo(idJ) > 0) {
                        String temp = letter.get(i);
                        letter.set(i, letter.get(j));
                        letter.set(j, temp);
                    }
                }
            }
        }
        ans.addAll(letter);
        ans.addAll(digit);
        return ans.toArray(new String[0]);
    }
}