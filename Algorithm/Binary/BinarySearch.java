package Algorithm.Binary;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,23,34,35,56,67,78};
        System.out.println(binarySearch(arr, 67));
    }

    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
}
