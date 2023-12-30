package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(3);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        System.out.println(list);
        System.out.println(list.contains(103));
        list.set(0, 99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        for (int index = 0; index < 5; index++) {
            System.out.println(list.get(index));
        }

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int index = 0; index < 3; index++) {
            lists.add(new ArrayList<>());
        }
        for (int index = 0; index < 3; index++) {
            for (int j = 0; j < 3; j++) {
                lists.get(j).add(in.nextInt());
            }
        }
        System.out.println(lists);

    }
}
