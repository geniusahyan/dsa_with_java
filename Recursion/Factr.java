package Recursion;

public class Factr {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factr(num));

    }

    static int factr(int n){
        if (n <= 1) {
            return 1;
        }

        return n * factr(n-1);
    }
}
