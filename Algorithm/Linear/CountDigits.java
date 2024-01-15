package Algorithm.Linear;

public class CountDigits {
    public static void main(String[] args) {
        int digit = -121223;
        System.out.println(countDigit(digit));
        System.out.println(countDigit2(digit));
    }

    static int countDigit(int num){
        if (num < 0) {
            num = Math.abs(num);
        }
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        return count;
    }
    static int countDigit2(int num){
        if (num < 0) {
            num = Math.abs(num);
        }
        return (int)(Math.log10(num)) + 1;
    }
}
