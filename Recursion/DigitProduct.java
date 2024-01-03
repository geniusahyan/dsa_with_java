package Recursion;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = prod(1342);
        System.out.println(ans);
    }   
    
    static int prod(int n){
        if (n%10 == 0) {
            return n;
        }

        return (n % 10 ) * prod(n/10);
    }
}
