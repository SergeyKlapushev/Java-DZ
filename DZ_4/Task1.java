package DZ_4;

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {

    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<>();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);
        System.out.println("До - "+ linkList);
        System.out.println("После - "+ rev(linkList));
    }

    public static LinkedList<Integer> rev (LinkedList<Integer> linkList){
        Collections.reverse(linkList);
        return linkList;
    }
}
