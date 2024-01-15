package Algorithm;

public class LinearString {
    public static void main(String[] args) {
        String name = "Ahyan";
        char target = 'y';
        System.out.println(search(name, target));
        for (char string : name.toCharArray()) {
            System.out.println(string);
        }
    }

    static boolean search(String str, char target){
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
