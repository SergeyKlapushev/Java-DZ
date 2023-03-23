package DZ_4;

import java.util.Arrays;
import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя. */

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("В список: "+ linkList + " добавили элемент 0 в конец списка и получили: " + enqueue(linkList, 0));
        System.out.println("Первый элемент списка - " + dequeue(linkList) + ", мы его удалили и получили: " + linkList);
        System.out.println("Первый элемент списка: " + linkList + " - " + first(linkList));
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> linkList, Integer num) {
        linkList.addLast(num);
        return linkList;
    }

    public static Integer dequeue(LinkedList<Integer> linkList) {
        return linkList.removeFirst();
    }

    public static Integer first(LinkedList<Integer> linkList) {
        return linkList.getFirst();
    }
}
