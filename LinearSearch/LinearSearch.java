package LinearSearch;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {12,23,34, 56, 53};
        int target = sc.nextInt();
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target){
            if (arr.length ==0) {
                return -1;
            }

            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if (element == target) {
                    return i; //return the index of the found number
                }
            }
            return -1;
        }
}