package Algorithm.Binary;

public class SearchInMountain {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,3,1};
        int[] arr = {0,1,2,4,2,1};
        System.out.println(search(arr,3));
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

    static int orderAgnosticBS(int[] arr, int target, int left, int right){
        boolean isAsc = arr[left] < arr[right];
        while (left <= right) {
            // int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]) {
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
