package Recursion;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
    }

    static void dice(String p, int target){
        if (target == 0){
            System.out.println("Path: " + p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++){
            dice(p + i, target - i);
        }
    }
    /*
    static ArrayList<String> diceRet(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 1; i <= 6 && i <= target; i++){
            diceRet(p + i, target - i);
        }
    }
    */

}
