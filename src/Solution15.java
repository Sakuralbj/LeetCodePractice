import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return list1;
        }
        if (nums[0] > 0 || nums[nums.length - 1] < 0) {
            return list1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            }
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[l]==nums[l-1]&&l>i+1){
                    l++;
                    continue;
                }
                if (nums[r]==nums[r+1]&&r<nums.length-1){
                    r--;
                    continue;
                }
                if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else {
                    List<Integer> list2 = new ArrayList<Integer>();
                    list2.add(nums[i]);
                    list2.add(nums[l]);
                    list2.add(nums[r]);
                    list1.add(list2);
                    r--;
                    l++;
                }
            }

        }
        return list1;
    }

    }




