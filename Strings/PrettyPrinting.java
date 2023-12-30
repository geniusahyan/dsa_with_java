package Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1234f;
        System.out.printf("Formatted number is %.3f ,", a);
        System.out.printf("Pie: %.6f", Math.PI);
        System.out.printf("Hello my name is something %s", "Some", "Cool");

        /*
          %c - Character
          %d - Decimal numner (base 10)
          %e - Exponential floating-point number
          %f - Floating-point number
          %i - Integer (base 10)
          %o - octal numner (base)
          %s - String
          %u - Unsigned decimal (integer) number
          %x - Hexadecimal number (base 16)
          %t - Date/Time
          %n - Newline
        */
    }
}
