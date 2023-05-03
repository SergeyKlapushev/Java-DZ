package Itog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.*;
import java.util.jar.Attributes.Name;
import java.util.regex.Matcher;

import javax.print.attribute.standard.MediaSize.NA;
import javax.smartcardio.Card;
import javax.swing.text.html.StyleSheet;

public class Itog {
    public static void main(String[] args) throws IOException {

        System.out.print(
                "\nВведите цифру, соответствующую необходимому критерию:\n1 - Производитель;\n2 - Процессор;\n3 - Объём оперативной памяти;\n4 - Объём жёсткого диска;\n5 - Операционная система\n* - чтобы посмотреть весь каталог\n");

        BufferedReader catalog = new BufferedReader(new FileReader("Catalog.txt", Charset.forName("UTF-8")));
        Integer choiceInt;
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        switch (choice) {
            case "1":
                choiceInt = Integer.parseInt(choice);
                filtering(catalog, choiceInt);
                break;

            case "2":
                choiceInt = Integer.parseInt(choice);
                filtering(catalog, choiceInt);
                break;

            case "3":
                choiceInt = Integer.parseInt(choice);
                filtering(catalog, choiceInt);
                break;

            case "4":
                choiceInt = Integer.parseInt(choice);
                filtering(catalog, choiceInt);
                break;

            case "5":
                choiceInt = Integer.parseInt(choice);
                filtering(catalog, choiceInt);
                break;

            case "*":
                showCatalog(catalog);
                break;

            default:
                System.out.println("Такого параметра фильтрации не существует");
                break;

        }
        scan.close();
    }

    public static void showCatalog(BufferedReader catalog) throws IOException {
        String line = catalog.readLine();
        System.out.println("Каталог ноутбуков:");
        while (line != null) {
            System.out.println(" " + line);
            line = catalog.readLine();
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void filtering(BufferedReader catalog, Integer choiceInt) throws IOException {
        showCriteria(catalog, choiceInt);
    }

    public static void showCriteria(BufferedReader catalog, Integer choiceInt) throws IOException {
        String line = catalog.readLine();
        String[] firms = line.split(" ");
        Set<String> set = new HashSet<>();

        while (line != null) {

            firms = line.split(" ");
            set.add(firms[choiceInt - 1]);
            line = catalog.readLine();

        }

        catalog = new BufferedReader(new FileReader("Catalog.txt", Charset.forName("UTF-8")));
        if (choiceInt == 1) {
            System.out.println("Доступные фирмы производители ноутбуков: " + set.toString());
        }
        if (choiceInt == 2) {
            System.out.println("Доступные фирмы процессоров: " + set.toString());
        }
        if (choiceInt == 3) {
            System.out.println("Доступные объёмы оперативной памяти: " + set.toString());
        }
        if (choiceInt == 4) {
            System.out.println("Доступные объёмы жёстких дисков: " + set.toString());
        }
        if (choiceInt == 5) {
            System.out.println("Доступные операционные системы: " + set.toString());
        }

        String[] firmsChoice = selectСriteria(choiceInt);
        filteringResult(firmsChoice, catalog, choiceInt);

    }

    public static String[] selectСriteria(Integer choiceInt) throws IOException {

        Scanner scan = new Scanner(System.in);
        if (choiceInt == 1) {
            System.out.print("\nВыберите интресующих вас производителей, через ПРОБЕЛ: ");
        }
        if (choiceInt == 2) {
            System.out.print("\nВыберите интресующие вас процессоры, через ПРОБЕЛ: ");
        }
        if (choiceInt == 3) {
            System.out.print("\nВыберите интресующие вас объёмы оперативной памяти, через ПРОБЕЛ: ");
        }
        if (choiceInt == 4) {
            System.out.print("\nВыберите интресующие вас объёмы жёстких дисков, через ПРОБЕЛ: ");
        }
        if (choiceInt == 5) {
            System.out.print("\nВыберите интресующие вас операционные системы, через ПРОБЕЛ: ");
        }
        
        String choice = scan.nextLine();
        choice = choice + " ";
        scan.close();

        String[] arrIn = choice.split(" ");
        return arrIn;

    }

    public static void filteringResult(String[] firmsChoice, BufferedReader catalog, Integer choiceInt)
            throws IOException {

        String line = catalog.readLine();
        String[] arr = line.split(" ");

        System.out.println("\nРезулитаты фильтрации: ");
        while (line != null) {

            for (int i = 0; i < firmsChoice.length; i++) {
                arr = line.split(" ");

                if (arr[choiceInt - 1].equals(firmsChoice[i])) {
                    System.out.println(line);
                }

            }
            line = catalog.readLine();
        }
        System.out.println("\n");
    }
}