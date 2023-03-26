package DZ_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Task1 {
   /* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */

    public static void main(String[] args) {

        HashMap<Integer, String> Phonebook = new HashMap<>();
        Phonebook.put(212133, "Лидия Аркадьевна Бубликова");
        Phonebook.put(162348, "Иван Михайлович Серебряков");
        Phonebook.put(8082771, "Дональд Джон Трамп");

        Set<Integer> keys = Phonebook.keySet();
        System.out.println("Ключи: " + keys);

        ArrayList<String> values = new ArrayList<>(Phonebook.values());
        System.out.println("Значения: " + values);

    }
}
