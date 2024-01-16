package Algorithm.Binary;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {98,87,76,65,67,43,32,21,12};
        System.out.println(orderAgnosticBS(arr, 67));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            // int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
