package DZ_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    /*
     * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
     * человек может иметь несколько телефонов.
     */

    public static void main(String[] args) {

        HashMap<Integer, String> phoneBook = new HashMap<>();

        phoneBook.put(123124, "Клапышев Сергей Михайлович");
        phoneBook.put(363636, "Трухин Матвей Владимирович");
        phoneBook.put(257547, "Кораблёва Мария Александровна");
        phoneBook.put(89832762, "Клапышев Сергей Михайлович");
        choseFind(phoneBook);
    }

    public static void choseFind(HashMap<Integer, String> phoneB) {

        Scanner chose = new Scanner(System.in);
        System.out.println(
                "Введите 1 - это поиск человека по номеру телефона\nВведите 2 - это поиск номера(ов) по ФИО человека");
        Integer num = chose.nextInt();

        if (num == 1) {
            findByNumPhone(phoneB, chose);
        }

        if (num == 2) {
            findByFIO(phoneB, chose);
        }

        chose.close();
    }

    public static void findByNumPhone(HashMap<Integer, String> phoneB, Scanner scan) {

        System.out.println("Введите номер телефона: ");
        Integer numPhone = Integer.parseInt(System.console().readLine());
        System.out.print("Пользователь с номером " + numPhone + ": ");

        for (Map.Entry<Integer, String> entry : phoneB.entrySet()) {

            if (entry.getKey().equals(numPhone)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public static void findByFIO(HashMap<Integer, String> phoneB, Scanner scan) {

        System.out.println("Введите ФИО человека: ");
        String fio = System.console().readLine();
        System.out.println("Номера: ");
        for (Map.Entry<Integer, String> entry : phoneB.entrySet()) {

            if (entry.getValue().equals(fio)) {
                System.out.println(" " + entry.getKey());
            }
        }
    }
}
