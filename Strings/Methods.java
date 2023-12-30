package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Hello some ";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('e', 3));
        System.out.println("Substring: "+name.substring(2)); // from index 1 to 6 (not including
        System.out.println("     some       ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.length() );
        System.out.println("name".codePointAt(1) );
        System.out.println("name".hashCode() );
    }
}
