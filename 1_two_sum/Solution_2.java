import java.util.HashMap;
import java.util.Map;

class Solution_2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int idx = 0; idx < nums.length; idx++) {
            int diff = target - nums[idx];

            if (map.containsKey(nums[idx])) {
                return new int[] { map.get(nums[idx]), idx };
            }

            map.put(diff, idx);
        }

        throw new RuntimeException("There is no two sum");
    }

}