import java.util.Arrays;

public class ArrayPartitionI561 {
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        return nums[0]+nums[nums.length-1] ;
    }

}
