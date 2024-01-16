package Algorithm.Binary;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a','b','g','j'};
        System.out.println(smallestLetter(arr, 'g'));
    }

    static char smallestLetter(char[] arr, char target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            // int mid = (left + right) / 2;
            int mid = left + (right - left) / 2;
            if (target < arr[mid]) {
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return arr[left % arr.length] ;
    }
}
