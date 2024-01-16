package Algorithm.Binary;
import java.util.Arrays;
public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int[] num = searchRange(arr, 8);
        System.out.println(Arrays.toString(num));
    }

    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};
        int left = search(arr, target, true);
        int right = search(arr, target, false);

        ans[0] = left;
        ans[1] = right;
        
        return ans;
    }
    static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            // int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;
            if (target < arr[mid]) {
                right = mid -1;
            }else if (target > arr[mid]){
                left = mid + 1;
            }else{
                ans = mid;
                if (findStartIndex) {
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return ans;
    }
}
