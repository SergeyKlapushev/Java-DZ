import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list = fillList(list);
        list = deliteEvenNumber(list);
        System.out.print(list);
    }

    public static ArrayList<Integer> fillList(ArrayList<Integer> lst) {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            lst.add(rand.nextInt(0, 10));
        }
        return lst;
    }

    public static ArrayList<Integer> deliteEvenNumber(ArrayList<Integer> lst) {
        
        for (int i = 0; i < lst.size(); i++) {            
            if(lst.get(i)%2 == 0){
                lst.remove(lst.get(i));
                i--;         
            }
        }
        return lst;
    }
}
