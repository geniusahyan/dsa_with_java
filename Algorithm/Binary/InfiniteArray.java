package Algorithm.Binary;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {12,23,34,35,56,67,78};
        System.out.println(findingRange(arr, 67));
    }

    static int findingRange(int[] arr,int target){
        int left = 0;
        int right = 1;

        while (target > arr[right]) {
            int temp = right + 1;
            right = right + (right - left + 1) * 2 ;
            left = temp;
        }
        return binarySearch(arr, target, left, right);
    }
    static int binarySearch(int[] arr, int target, int left , int right){
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
