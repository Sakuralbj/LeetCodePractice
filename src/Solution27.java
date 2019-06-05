import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i,j;
        Arrays.sort(nums);
        for ( i=0;i<nums.length;i++){
            if (nums[i]==val){
                break;
            }
        }
        for (j=i;j<nums.length;j++){
            if (nums[j]!=val){
                break;
            }
        }
        for (int k=i;k<nums.length+i-j;k++){
            nums[k]=nums[k+j-i];
        }
        return nums.length+i-j;

    }
}
