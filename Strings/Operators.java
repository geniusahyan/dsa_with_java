package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println('a');
        System.out.println("a" + "b");
        System.out.println("a" + 3);
        // this is same as after a few steps: "a" + "3";
        // interger will be converted to Integer that will call toString();
        System.out.println(('a' + 3));
        System.out.println((char)('a' + 3));

        System.out.println("Hello" + new ArrayList<>());
        System.out.println("Hello" + new Integer(23));
        System.out.println(new ArrayList<>() + "" + new Integer(23));
    }
}
