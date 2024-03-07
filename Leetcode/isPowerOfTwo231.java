import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n){
        if (n <= 0) {
            return false ;
        }
        return (n & (n-1)) == 0;
    }
}