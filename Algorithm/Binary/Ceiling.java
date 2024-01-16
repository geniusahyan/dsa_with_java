package Algorithm.Binary;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {12,23,34,35,56,67,78};
        System.out.println(ceiling(arr, 20));
    }

    static int ceiling(int[] arr, int target){
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            // int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}
