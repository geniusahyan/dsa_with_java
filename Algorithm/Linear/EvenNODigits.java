package Algorithm.Linear;

public class EvenNODigits {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56,57};
        System.out.println(evenNoDigit(arr));
    }

    static int evenNoDigit(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        int maxEven = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                maxEven++;
            }
        }
        return maxEven;
    }
}
