package by.minsler.lineremover;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Dzmitry Varabei
 */
public class LineRemover implements LineRemovable {

    public void createFileBySet(String url, Set result) throws IOException {
        FileWriter recCompanies = null;
        BufferedWriter buffRecCompanies=null;
        File creatingFile = new File(url);

        try {
            creatingFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }

        try {
            recCompanies = new FileWriter(creatingFile.getPath());
            buffRecCompanies = new BufferedWriter(recCompanies);
            Iterator iterator = result.iterator();
            while (iterator.hasNext()){
                buffRecCompanies.write((String)iterator.next() +  "\n");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при открытии исходящего потока или при буферизации исходящего потока");
            e.printStackTrace();
        } finally {
            try {
                buffRecCompanies.flush();
                buffRecCompanies.close();
                recCompanies.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии исходящего потока или при закрытии буфера исходящего потока");
                e.printStackTrace();
            }

        }

    }

    @Override
    public Set<String> removeElements(String companiesUrl, String slovarUrl) throws IOException {

        FileReader fileCompanies = new FileReader(companiesUrl);
        FileReader fileSlovar = new FileReader(slovarUrl);
        Set glossaryCompanies = new HashSet();
        Set checkingCompanies = new HashSet();
        try {
            glossaryCompanies = initGlossary(fileSlovar);
            checkingCompanies = initGlossary(fileCompanies);
        } catch (IOException e1) {
            System.out.println("Ошибка при чтении файла");
            e1.printStackTrace();
        } finally {
            try {
                fileSlovar.close();
                fileCompanies.close();
            } catch (IOException e2) {
                System.out.println("При закрытии потока произошла ошибка");
                e2.printStackTrace();
            }
        }

        checkingCompanies.removeAll(glossaryCompanies);
        return (checkingCompanies);
    }

    public Set<String> initGlossary(FileReader glossary) throws IOException {

        Set glossaryInsSet = new HashSet();
        BufferedReader buff = new BufferedReader(glossary);
        try {
            while (true) {
                String line = buff.readLine();
                if (line == null) break;
                glossaryInsSet.add(line);
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
            e.printStackTrace();
        }
        finally{
            try {
                buff.close();
            }
            catch (IOException e1) {
                System.out.println("Ошибка при закрытии буфера");
                e1.printStackTrace();
            }
        } return glossaryInsSet;
    }

      /*public static void main(String[] args) throws IOException {
          String str1 = "КЛЕВОЪabc";
          String str2 = "клевоъABC";

          boolean b =  str1.equalsIgnoreCase(str2);

          System.out.println(b);
      }   */
}



