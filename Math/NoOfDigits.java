package Math;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 341223567;
        int b = 10;
        int ans = (int)(Math.log(n)/Math.log(b) + 1);
        System.out.println("Number of digits in " + n + " is: " + ans);
    }
}
