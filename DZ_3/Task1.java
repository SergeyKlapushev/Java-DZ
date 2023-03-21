import java.util.ArrayList;
import java.util.Collections;


/* Реализовать алгоритм сортировки слиянием */

public class Task1 {
    public static void main(String[] args) {
        Integer[] firstArray = {5,2,4,6,1};
        Integer[] secondArray = {0,3,12,7,9};

        ArrayList<Integer> mergeArr = new ArrayList<>();

        mergeArr = mergeSorting(firstArray, secondArray);

        System.out.println(mergeArr);
        Collections.sort(mergeArr); 
        System.out.println(mergeArr); 

    }

    public static ArrayList<Integer> mergeSorting (Integer[] fArr, Integer[] sArr){

        ArrayList<Integer> result = new ArrayList<>();
        for(int i =0; i<fArr.length; i++){
            result.add(fArr[i]);
        }
        for(int i =0; i<sArr.length; i++){
            result.add(sArr[i]);
        }
        return result;
    }
}
