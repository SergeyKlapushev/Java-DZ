import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list = fillList(list);
        System.out.print(list+"\n");
        System.out.print("max = "+ findMax(list)+"\n");
        System.out.print("min = "+ findMin(list)+"\n");
        System.out.print("average = "+ findAverage(list));
    }

    

    public static ArrayList<Integer> fillList(ArrayList<Integer> lst) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            lst.add(rand.nextInt(0, 10));
        }
        return lst;
    }
    
    private static Integer findMax(ArrayList<Integer> lst) {
        return Collections.max(lst);
    }
    
    private static Integer findMin(ArrayList<Integer> lst) {
        return Collections.min(lst);
    }

    private static Integer findAverage(ArrayList<Integer> lst) {
        int aver = 0;

        for (int i = 0; i < lst.size(); i++) {
            aver = aver + lst.get(i);
        }
        return aver / lst.size();
    }
}
