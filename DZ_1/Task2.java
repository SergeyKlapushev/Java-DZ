import java.util.ArrayList;
import java.util.List;

/* Вывести все простые числа от 1 до 1000 */
public class Task2 {

    public static void main(String[] args) {
        
        List<Integer> primes = new ArrayList<>();
        

        for (int i = 1; i <= 1000; i++) {
            Boolean primeNumber = true;                        

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNumber = false;
                    break;
                }
            }

            if (primeNumber == true) {
                primes.add(i);
            }
            
        }

        System.out.println("Простые числа: " + primes);
    }
}
