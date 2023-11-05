import java.util.HashMap;

/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
*/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            Integer dif = target-nums[i];
            if(map.get(dif) != null) {
                return new int[]{i, map.get(dif)};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] result1 = TwoSum.twoSum(new int[] {2,7,11,5}, 9);
        int[] result2 = TwoSum.twoSum(new int[] {3,2,4}, 6);
        int[] result3 = TwoSum.twoSum(new int[] {3,3}, 6);
        int[] result4 = TwoSum.twoSum2(new int[] {2,7,11,5}, 9);
        int[] result5 = TwoSum.twoSum2(new int[] {3,2,4}, 6);
        int[] result6 = TwoSum.twoSum2(new int[] {3,3}, 6);

        System.out.println(result1[0] + ", " + result1[1]);
        System.out.println(result2[0] + ", " + result2[1]);
        System.out.println(result3[0] + ", " + result3[1]);
        System.out.println(result4[0] + ", " + result4[1]);
        System.out.println(result5[0] + ", " + result5[1]);
        System.out.println(result6[0] + ", " + result6[1]);

    }
}
