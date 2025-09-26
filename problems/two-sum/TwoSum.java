import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[] { seen.get(need), i };
            }
            seen.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);
        if (res == null) {
            System.out.println("null");
        } else {
            System.out.println("[" + res[0] + ", " + res[1] + "]");
        }
    }
}
