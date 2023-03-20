import java.util.Scanner;

/*
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} 
*/

public class Task1 {
    public static void main(String[] args) {
        String[][] params = getRequest();
        StringBuilder request = new StringBuilder();
        request.append("SELECT * FROM students WHERE ");
        String prefix = "";
        for (int i = 0; i < params.length; i++) {
            if (!params[i][1].toLowerCase().equals("null") && !params[i][1].equals(null)) {
                request.append(prefix);
                prefix = " AND ";
                request.append(params[i][0]);
                request.append("='");
                request.append(params[i][1]);
                request.append("'");
            }
        }
        System.out.println(request);
    }

    public static String[][] getRequest() {
        Scanner inp = new Scanner(System.in);
        String inputString = inp.nextLine();
        inp.close();
        if (inputString.isEmpty() || inputString.equals(null)) {
            System.out.println("Ошибка ввода.");
            System.exit(0);
        }
        inputString = inputString.replaceAll("[{}\"]", "").replaceAll(", ", ",");
        String[] inputPairs = inputString.split(",");
        String[][] output = new String[inputPairs.length][];
        for (int i = 0; i < inputPairs.length; i++) {
            output[i] = inputPairs[i].split(":");
        }
        return output;
    }
}     
