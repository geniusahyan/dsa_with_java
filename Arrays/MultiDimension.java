package Arrays;

import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        //    int[][] arr = new int[3][3];
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] ele:arr){
            System.out.print("\n");
            for(int num:ele){
                System.out.print(num);
            }
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print("\n");
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
