package DZ_5;

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
import javax.swing.text.html.StyleSheet;

public class Task2 {

    public static void main(String[] args) throws IOException {

        String pathProgect = System.getProperty("user.dir");
        String pathFile = pathProgect.concat("\\fileNames.txt");
        File fileN = new File(pathFile);
        FileReader fileR = new FileReader(fileN);

        List<String> myList = new ArrayList<>();
        List<String> names = readFileAndKeepArrayNames(fileR, myList);
        Set<String> setNames = new HashSet<>();
        setNames = fillInTheSet(names, setNames);
        Map<String, Integer> countDuplicate = findDuplicateNamesAndThemQuantity(names, setNames);
        
        System.out.println(names);
        System.out.println(setNames);
        System.out.println(countDuplicate);   ; 
        
    }

    public static ArrayList readFileAndKeepArrayNames(FileReader fR, List list) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("fileNames.txt", Charset.forName("UTF-8")));
        try {

            ArrayList<String> al = new ArrayList<>();
            String line = br.readLine();
            String[] strArr = line.split(" ");
            
            while (line != null) {   
                strArr = line.split(" ");                

                for (int i = 0; i < strArr.length; i=i+2) {
                    al.add(strArr[i]);
                }
                line = br.readLine();                
            }
            return al;

        } finally {
            br.close();
        }
    }

    public static Set<String> fillInTheSet(List<String> names, Set<String> setNames){
        for (int i = 0; i < names.size(); i++) {
            setNames.add(names.get(i));
        }
        return setNames;
    }
    
    public static Map<String, Integer> findDuplicateNamesAndThemQuantity(List<String> names, Set<String> setNames){

        int count = 0;

        Map<String, Integer> setDuplicateNames = new HashMap();
        
        for (String name : setNames) {

            for (int i = 0; i < names.size(); i++) {
                if (name.equals(names.get(i))){
                    count++; 
                }                
            }
            if(count > 1){
                setDuplicateNames.put(name, count);
            }
            count = 0;           
        }

        return setDuplicateNames;
    }
}

