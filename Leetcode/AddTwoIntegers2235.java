import java.util.Scanner;

public class AddTwoIntegers2235 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(sum(n, n2));
    }
    public static int sum(int num1, int num2){
        if(num1 == 0 && num2 ==0){
            return 0;
        }
        if(num1 == 0){
            return num2;
        }else if (num2 == 0) {
            return num1;
        } else{
            return num1 + num2;
        }
    }
}
