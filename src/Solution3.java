import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int i=0,j=0;
        int maxsize=0;

        while (i<s.length()) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                i++;
                if (set.size() > maxsize) {
                    maxsize = set.size();
                }
                continue;
            }

            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(j));
                j++;
                continue;
            }
        }

        return maxsize;


    }

    public static void main(String[] args) {
        Solution3 s3=new Solution3();
        System.out.println(s3.lengthOfLongestSubstring(""));
    }
}
