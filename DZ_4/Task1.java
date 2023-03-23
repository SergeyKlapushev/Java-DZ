package DZ_4;

import java.util.LinkedList;

/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список. */

public class Task1 {
    public static void main(String[] args) {
        
        LinkedList<Integer> linkList = new LinkedList();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(4);
        linkList.add(5);
        System.out.println(linkList);
    }
}
