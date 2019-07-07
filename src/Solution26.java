public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int pre=nums[0];
        int total=1;

        for (int i=1;i<nums.length;i++){
            if (nums[i]==pre){
                continue;
            }
            pre=nums[i];
            nums[total]=nums[i];
            total++;


        }
        return total;

    }
}
