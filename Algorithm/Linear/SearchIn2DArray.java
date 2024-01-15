package Algorithm.Linear;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][]  arr = {
            {12,23,34},
            {45,56,10,23},
            {2,3, 32,14,23,}
        };
        int target = 14;
        System.out.println(search(arr, target));
    }

    static int search(int [][] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return arr[i][j];
                }
            }
        }

        return -1;
    }
}
