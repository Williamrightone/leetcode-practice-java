package tw.william.leetcode.leet.easy;

public class TwoSum {

    public static void main(String[] args) {

        int[] x1 = {2, 7, 11, 15};

        int target1 = 9;

    }

    static int[] twoSum(int[] nums, int target){

        int l = nums.length;

        for(int i = 0; i < l; i++){

            for(int j = i + 1; j < l; j++){

                if(nums[i] + nums[j] == target){

                    return new int[]{i, j};

                }
            }
        }
        return new int[] {};
    }

}
