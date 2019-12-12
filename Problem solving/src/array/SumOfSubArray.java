package array;

import java.util.Arrays;

public class SumOfSubArray {

	
	public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(j != i) {
                    if(nums[i] + nums[j] == target) {
                        result[0] = nums[i];
                        result[1] = nums[j];
                        return result;
                    }
                }
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {2, 7, 11, 15};
		
		System.out.println(Arrays.toString(twoSum(nums, 9)));
	}

}
