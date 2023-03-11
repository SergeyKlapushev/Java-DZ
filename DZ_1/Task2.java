package DZ_1;

import java.util.ArrayList;
import java.util.List;

/* Вывести все простые числа от 1 до 1000 */
public class Task2 {

    public static void main(String[] args) {

        int[] array = createArray(1, 1000);
        
        System.out.println(findPrimeNumbers(array).toString());

    }

    private static int[] createArray(int index, int diop) {

        int[] arr = new int [diop+1];

        for(int i = index; i!= arr.length; i++)
        {
            arr[i] = i;
        }
        return arr;
    }

    private static List<Integer> findPrimeNumbers(int[] arr){
        
        List<Integer> lst = new ArrayList<>();

        for (int index = 1; index < arr.length; index++) {

            for (int jindex = 1; jindex < arr.length; jindex++) {
                
                if (jindex > index)
                {
                    continue;
                }

                else{
                    if(index % jindex == 0 && jindex < index)
                    {
                        if(jindex == 1 || jindex == index)
                        {
                            lst.add(index);
                        }
                                            
                    }
                }
                
            }
        }     
        return lst;
    }
}
