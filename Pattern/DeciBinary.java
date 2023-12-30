package Pattern;

import java.util.Scanner;

public class DeciBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a decimal number:");
        System.out.println("Enter a binary number:");
        int num = sc.nextInt();
        int rem, ans = 0, mul=1;
        /*
        while (num > 0){
            // rem = num % 2;
            // rem = num&1;
            // num /= 2;
            num >>=1;
            ans += rem * mul;
           // mul *= 16;  to convert it into hexadecimal system
           mul *= 10;
        }
        System.out.print("The binary representation of "+num+" is : " + ans);
        
        while (num > 0) {
            rem = num % 10;
            num /= 10;
            ans += rem * mul;
            mul *= 2;
        }
        System.out.println("decimal is : " + ans);
        */
    }
}
