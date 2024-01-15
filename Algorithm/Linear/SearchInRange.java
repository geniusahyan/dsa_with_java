package Algorithm.Linear;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num = {12,23,34,45,56,1,2,3};
        int target = 23;
        System.out.println(linearSearch(num, target, 3, 6));
    }

    static boolean linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return false;
        }
       
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
