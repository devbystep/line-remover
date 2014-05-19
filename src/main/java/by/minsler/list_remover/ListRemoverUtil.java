package by.minsler.list_remover;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Aliaksei Pashkouski
 */
public class ListRemoverUtil {

    public static Set<String> createSetFromFile(String filePath){
        Set<String> set = new HashSet<>();
        FileReader file = null;
        BufferedReader buff = null;
        try{
            file = new FileReader(filePath);
            buff = new BufferedReader(file);
            while(true){
                String line = buff.readLine();
                if(line == null) break;
                set.add(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                buff.close();
                file.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return set;
    }

    public static void writeSetToFile(Set<String> result, String filePath){
        FileWriter file = null;
        BufferedWriter buff = null;
        try{
            file = new FileWriter(filePath);
            buff = new BufferedWriter(file);
            for (String line : result){
                buff.write(line);
                buff.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                buff.flush();
                buff.close();
                file.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Set<String> set1 = createSetFromFile("D:/glossary.txt");
        Set<String> set2 = createSetFromFile("D:/check.txt");
        ListRemoverImpl listRemoverImpl = new ListRemoverImpl();
        Set<String> set3 = listRemoverImpl.getUniqueElements(set1, set2);
        writeSetToFile(set3, "D:/result.txt");
    }
}
