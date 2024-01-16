package Algorithm.Binary;

public class Mountain {
    public static void main(String[] args) {
        // int[] arr = {0,2,1,0};
        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
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
}
