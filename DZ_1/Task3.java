import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        

        Writer("Введите первое число: ");
        int num1 = imputNumber(scan);
        sb.append(num1);
        
        Writer("Выберите операцию (+, -, *, /): ");
        String oper = choiseOperation(scan);
        sb.append(oper);

        Writer("Введите второе число: ");
        int num2 = imputNumber(scan);
        sb.append(num2);

        sb.append(" = ");

        int res = result(num1, oper, num2);

        sb.append(res);

        scan.close();

        Writer(sb.toString());

    }

    public static String Writer(String str)
    {
        System.out.println(str);
        return str; 
    }

    public static int imputNumber(Scanner scan)
    {
        Integer num = scan.nextInt();
        return num;
    } 

    public static String choiseOperation(Scanner scan)
    {
        String operation = scan.next();
        return operation;
    }

    public static Integer result (int n1, String op, int n2)
    {
        int res = 0;
        switch (op) {
            case "+": res = n1 + n2; break;

            case "-": res = n1 - n2; break;

            case "*": res = n1 * n2; break;
            
            case "/": res = n1 / n2;
        }

        return res;
    }

}
