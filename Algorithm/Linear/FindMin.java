package Algorithm.Linear;

public class FindMin {
    public static void main(String[] args) {
        int[] num = {12,23,34,45,56,10,2,3};
        System.out.println(findMin(num));
    }
    public static int findMin(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
}
