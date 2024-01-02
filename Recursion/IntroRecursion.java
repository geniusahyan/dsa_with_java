package Recursion;

public class IntroRecursion {
    public static void main(String[] args) {
        mess();
    }

    static void mess(){
        System.out.println("Hello World!");
        mess2();
    }
    static void mess3(){
        System.out.println("Hello World!");
        mess4();
    }
    static void mess2(){
        System.out.println("Hello World!");
        mess3();
    }
    static void mess4(){
        System.out.println("Hello World!");
    }
}
