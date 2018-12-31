package UniqueEmailAddresses;

import java.util.ArrayList;
import java.util.List;

public class UniqueEmailAddresses {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(solution.numUniqueEmails(emails));
    }
}

class Solution {
    int numUniqueEmails(String[] emails) {
        List<String> uniqueEmails = new ArrayList<>();
        for (String email : emails) {
            String[] twoParts = email.split("@");
            twoParts[0] = twoParts[0].split("\\+")[0];
            twoParts[0] = twoParts[0].replace(".", "");
            email = twoParts[0] + "@" + twoParts[1];
            if (!uniqueEmails.contains(email)) {
                uniqueEmails.add(email);
            }
        }
        return uniqueEmails.size();
    }
}
