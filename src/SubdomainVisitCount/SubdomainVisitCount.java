package SubdomainVisitCount;

import java.util.*;

public class SubdomainVisitCount {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] s = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        String[] s2 = {"9001 discuss.leetcode.com"};
        List<String> list;
        list = solution.subdomainVisits(s);
        for (String l : list)
            System.out.println(l);
    }
}

class Solution {
    List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String times = cpdomain.split(" ")[0];
            String[] domains = cpdomain.split(" ")[1].split("\\.");
            StringBuilder current = new StringBuilder();
            for (int j = domains.length - 1; j >= 0; j--) {
                if (j == domains.length - 1)
                    current.insert(0, domains[j]);
                else
                    current.insert(0, domains[j] + ".");
                if (map.containsKey(current.toString()))
                    map.put(current.toString(), map.get(current.toString()) + Integer.parseInt(times));
                else
                    map.put(current.toString(), Integer.parseInt(times));
            }
        }
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet())
            ans.add(entry.getValue() + " " + entry.getKey());

        return ans;
    }
}
