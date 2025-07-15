import java.util.Arrays;

public class TaskTwoSum {
    public static void main(String[] args) {

        System.out.println();
        System.out.print("Массив = ");
        int[] nums = new int[4];
        for (int r = 0; r < nums.length; r++) {
            double max = 20.0, min = 0.0;
            nums[r] = (int) (Math.random() * (max - min + 1.0) + min);
            System.out.print(nums[r] + ", ");
        }
        System.out.println();
        System.out.print("Целевое число = ");
        int target = 20;
        System.out.println(target);
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
