package Arrays;
import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // primitive array 
        /*
        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("\nforeach\n");

        for(int ele:arr){
            System.out.println(ele);
        }

        System.out.println(Arrays.toString(arr));
        
        
        String[] str = new String[4];
        for(int i=0; i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        */

        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void change(int[] arr) {
        arr[1] = 17;
    }
    
}