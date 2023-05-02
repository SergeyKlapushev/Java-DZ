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

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        switch (choice) {
            case "1":
                filteringByFirms(catalog);
                break;

            case "2":
                filteringByProcessors(catalog);
                break;

            case "3":
                filteringByRAM(catalog);
                break;

            case "4":
                filteringByValueHardDrive(catalog);
                break;

            case "5":
                filteringByOS(catalog);
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
    public static void filteringByFirms(BufferedReader catalog) throws IOException {
        showFirms(catalog);
    }

    public static void showFirms(BufferedReader catalog) throws IOException {
        String line = catalog.readLine();
        String[] firms = line.split(" ");
        Set<String> set = new HashSet<>();

        while (line != null) {

            firms = line.split(" ");
            set.add(firms[0]);
            line = catalog.readLine();

        }

        catalog = new BufferedReader(new FileReader("Catalog.txt", Charset.forName("UTF-8")));

        System.out.println("Доступные фирмы производители ноутбуков: " + set.toString());
        String[] firmsChoice = choiceFirms();
        resoultOfFortedByFirms(firmsChoice, catalog);

    }

    public static String[] choiceFirms() throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nВыберите интресующего вас производителя(ей), через ПРОБЕЛ: ");
        String choice = scan.nextLine();
        choice = choice + " ";
        scan.close();

        String[] arrIn = choice.split(" ");
        return arrIn;

    }

    public static void resoultOfFortedByFirms(String[] firmsChoice, BufferedReader catalog) throws IOException{

        String line = catalog.readLine();
        String[] arr = line.split(" ");


        System.out.println("\nРезулитаты фильтрации: ");
        while(line != null){

            for (int i = 0; i < firmsChoice.length; i++) {
                arr = line.split(" ");

                if(arr[0].equals(firmsChoice[i])){
                    System.out.println(line);
                }

            }
            line = catalog.readLine();
        }
        System.out.println("\n");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void filteringByProcessors(BufferedReader catalog) throws IOException {
        showProcessors(catalog);
    }
    
    public static void showProcessors(BufferedReader catalog) throws IOException {

        String line = catalog.readLine();
        String[] processors = line.split(" ");

        Set<String> set = new HashSet<>();

        while (line != null) {

            processors = line.split(" ");
            set.add(processors[1]);
            line = catalog.readLine();

        }

        catalog = new BufferedReader(new FileReader("Catalog.txt", Charset.forName("UTF-8")));

        System.out.println("Доступные фирмы процессоров: " + set.toString());
        String[] processorsChoice = choiceProcessers();
        resoultOfFortedByProcessors(processorsChoice, catalog);

    }
    
    public static String[] choiceProcessers() throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nВыберите интересующие вас процессоры, через ПРОБЕЛ: ");
        String choice = scan.nextLine();
        choice = choice + " ";
        scan.close();

        String[] arrIn = choice.split(" ");
        return arrIn;

    }
    
    public static void resoultOfFortedByProcessors(String[] processorsChoice, BufferedReader catalog) throws IOException{

        String line = catalog.readLine();

        String[] arr = line.split(" ");

        System.out.println("\nРезулитаты фильтрации: ");
        
        while(line != null){
            for (int i = 0; i < processorsChoice.length; i++) {
                arr = line.split(" ");

                if(arr[1].equals(processorsChoice[i])){
                    System.out.println(line);
                }

            }
            line = catalog.readLine();
        }
        System.out.println("\n");
    }
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void filteringByRAM(BufferedReader catalog) throws IOException {
        showRAM(catalog);
    }

    public static void showRAM(BufferedReader catalog) throws IOException {

        String line = catalog.readLine();
        String[] ram = line.split(" ");

        Set<String> set = new HashSet<>();

        while (line != null) {

            ram = line.split(" ");
            set.add(ram[2]);
            line = catalog.readLine();

        }

        catalog = new BufferedReader(new FileReader("Catalog.txt", Charset.forName("UTF-8")));

        System.out.println("Доступные объёмы оперативной памяти: " + set.toString());
        String[] ramChoice = choiceRAM();
        resoultOfFortedByRAM(ramChoice, catalog);

    }
 
    public static String[] choiceRAM() throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nВыберите интересующие вас объём оперативной памяти, через ПРОБЕЛ: ");
        String choice = scan.nextLine();
        choice = choice + " ";
        scan.close();

        String[] arrIn = choice.split(" ");
        return arrIn;

    }

    public static void resoultOfFortedByRAM(String[] ramChoice, BufferedReader catalog) throws IOException{

        String line = catalog.readLine();

        String[] arr = line.split(" ");

        System.out.println("\nРезулитаты фильтрации: ");
        
        while(line != null){
            for (int i = 0; i < ramChoice.length; i++) {
                arr = line.split(" ");

                if(arr[2].equals(ramChoice[i])){
                    System.out.println(line);
                }

            }
            line = catalog.readLine();
        }
        System.out.println("\n");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void filteringByValueHardDrive(BufferedReader catalog) throws IOException {
        showValueHardDrive(catalog);
    }

    public static void showValueHardDrive(BufferedReader catalog) throws IOException {

        String line = catalog.readLine();
        String[] valueHD = line.split(" ");

        Set<String> set = new HashSet<>();

        while (line != null) {

            valueHD = line.split(" ");
            set.add(valueHD[3]);
            line = catalog.readLine();

        }

        catalog = new BufferedReader(new FileReader("Catalog.txt", Charset.forName("UTF-8")));

        System.out.println("Доступные объёмы жёсткого диска: " + set.toString());
        String[] valueHDChoice = choiceValueHardDrive();
        resoultOfFortedByValueHardDrive(valueHDChoice, catalog);

    }

    public static String[] choiceValueHardDrive() throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nВыберите интересующие объемы жёсткого диска, через ПРОБЕЛ: ");
        String choice = scan.nextLine();
        choice = choice + " ";
        scan.close();

        String[] arrIn = choice.split(" ");
        return arrIn;

    }

    public static void resoultOfFortedByValueHardDrive(String[] valueHDChoice, BufferedReader catalog) throws IOException{

        String line = catalog.readLine();

        String[] arr = line.split(" ");

        System.out.println("\nРезулитаты фильтрации: ");
        
        while(line != null){
            for (int i = 0; i < valueHDChoice.length; i++) {
                arr = line.split(" ");

                if(arr[3].equals(valueHDChoice[i])){
                    System.out.println(line);
                }

            }
            line = catalog.readLine();
        }
        System.out.println("\n");
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void filteringByOS(BufferedReader catalog) throws IOException {
        showOS(catalog);
    }

    public static void showOS(BufferedReader catalog) throws IOException {

        String line = catalog.readLine();
        String[] os = line.split(" ");

        Set<String> set = new HashSet<>();

        while (line != null) {

            os = line.split(" ");
            set.add(os[4]);
            line = catalog.readLine();

        }

        catalog = new BufferedReader(new FileReader("Catalog.txt", Charset.forName("UTF-8")));

        System.out.println("Доступные операционные системы: " + set.toString());
        String[] osChoice = choiceOS();
        resoultOS(osChoice, catalog);

    }
     
    public static String[] choiceOS() throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nВыберите интересующие вас операционные системы, через ПРОБЕЛ: ");
        String choice = scan.nextLine();

        choice = choice + " ";
        scan.close();

        String[] arrIn = choice.split(" ");
        return arrIn;

    }

    public static void resoultOS(String[] osChoice, BufferedReader catalog) throws IOException{

        String line = catalog.readLine();

        String[] arr = line.split(" ");

        System.out.println("\nРезулитаты фильтрации: ");
        
        while(line != null){
            for (int i = 0; i < osChoice.length; i++) {
                arr = line.split(" ");

                if(arr[4].equals(osChoice[i])){
                    System.out.println(line);
                }

            }
            line = catalog.readLine();
        }
        System.out.println("\n");
    }
}