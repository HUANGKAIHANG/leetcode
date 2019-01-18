package GroupsSpecialEquivalentStrings;

import java.util.*;

public class GroupsSpecialEquivalentStrings {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        Solution2 solution2 = new Solution2();
        String[] s1 = {"a","b","c","a","c","c"};
        String[] s2 = {"aa","bb","ab","ba"};
        String[] s3 = {"abc","acb","bac","bca","cab","cba"};
        String[] s4 = {"abcd","cdab","adcb","cbad"};
        System.out.println(solution.numSpecialEquivGroups(s1));
        System.out.println(solution.numSpecialEquivGroups(s2));
        System.out.println(solution.numSpecialEquivGroups(s3));
        System.out.println(solution.numSpecialEquivGroups(s4));
//        System.out.println(solution2.numSpecialEquivGroups(s4));
    }
}

class Solution {
    int numSpecialEquivGroups(String[] A) {
        int nums=0;
        Set<String> set = new HashSet<>(Arrays.asList(A));
        while (!set.isEmpty()){
            String now = set.iterator().next();
            nums++;
            set.remove(now);

            List<Character> odd = new ArrayList<>();
            List<Character> even = new ArrayList<>();
            for (int i = 0; i < now.length(); i=i+2)
                even.add(now.charAt(i));
            for (int i = 1; i < now.length(); i=i+2)
                odd.add(now.charAt(i));
            Collections.sort(odd);
            Collections.sort(even);

            Iterator<String> sets = set.iterator();
            List<String> removes = new ArrayList<>();
            while (sets.hasNext()){
                String str = sets.next();
                List<Character> comparedOdd = new ArrayList<>();
                List<Character> comparedEven = new ArrayList<>();
                for (int i = 0; i < str.length(); i++){
                    if (i%2==0)
                        comparedEven.add(str.charAt(i));
                    else
                        comparedOdd.add(str.charAt(i));
                }
                Collections.sort(comparedOdd);
                Collections.sort(comparedEven);

                if (String.valueOf(odd).equals(String.valueOf(comparedOdd))&&
                String.valueOf(even).equals(String.valueOf(comparedEven)))
                    removes.add(str);
            }
            for (String s: removes)
                set.remove(s);
        }
        return nums;
    }
}

//class Solution2 {
//    public int numSpecialEquivGroups(String[] A) {
//        Set<String> seen = new HashSet();
//        for (String S: A) {
//            int[] count = new int[52];
//            for (int i = 0; i < S.length(); ++i)
//                count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
//            System.out.println(Arrays.toString(count));
//            seen.add(Arrays.toString(count));
//        }
//        return seen.size();
//    }
//}