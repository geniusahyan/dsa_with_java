package Algorithm;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {12,23,34,45,56,1,2,3};
        int target = sc.nextInt();
        System.out.println(linearSearch(num, target));
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }
        /*
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        */
        for (int element : arr) {
            if (element == target) {
                return element;
            }
            
        }
        return -1;
    }
}
