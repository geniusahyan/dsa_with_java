package Arrays;

import java.util.Arrays;

public class ReverceArray {
    public static void main(String[] args) {
        int[] arr = {1,3, 23, 9,18};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
        reverce(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverce(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
     
}
