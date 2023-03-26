
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

public class Task2 {
    /* Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл. */

    public static void main(String[] args) throws IOException {

        PrintStream printStream = new PrintStream("log_file.txt");

        int[] bubbels = new int[7];

        bubbels = fillBubbleArray(bubbels);        
        String end = sortedArrayBubbels(bubbels, printStream);
        
        printStream.print(end);
    }  

    public static int[] fillBubbleArray(int[] bub){
        Random rnd = new Random();

        for (int i = 0; i < bub.length; i++) {
            bub[i] = rnd.nextInt(1, 10);            
        }
        return bub;
    } 

    public static String sortedArrayBubbels(int[] bub, PrintStream ps) throws FileNotFoundException{

        for (int i = 0; i < bub.length; i++) {
            for (int j = 0; j < bub.length; j++) {
                if (bub[i] < bub[j]) {
                    int temp = bub[i];
                    bub[i] = bub[j];
                    bub[j] = temp;
                    writeInFile(bub, ps);
                }
            }
        }
        return "Sorted complited";
    }

    public static void writeInFile(int[] bub, PrintStream printStream) throws FileNotFoundException{
        
        for (int i = 0; i < bub.length; i++) {
            printStream.print(bub[i]);
        }
        printStream.print("\n");
    }
}
