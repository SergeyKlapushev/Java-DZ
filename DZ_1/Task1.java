package DZ_1;

import java.util.Scanner;

import Scanner;
/* Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */
public class Task1 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        Integer num = iScanner.nextInt();
        System.out.println(num);
        int triangleNum = findTriagleNum(num);
        System.out.println("Треугольное число: " + triangleNum);
        iScanner.close();
    }

    public static int findTriagleNum(int num) {
        int triangleNum = 0;

        for (int i = 0; i < num; i++)
        {
            triangleNum = (triangleNum + i);
        }
        return triangleNum + num;
    }
    
}