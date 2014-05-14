package by.minsler.lineremover;

import by.minsler.LineRemoverUtil;
import by.minsler.lineremover.LineRemovable;
import by.minsler.lineremover.LineRemover;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Dzmitry Varabei
 */
public class LineRemoverTest {

    private LineRemovable lineRemover;    //замечательно видит сорцы, так почему бы не взять его из сорцов?
    //Создай метод initData в LineRemovable     и вызови тут


    @Test
    public void testStaticClass(){
        String slovarFileUlr = "....";
        String companiesFileUrl = "...";
        String resultUrl = "...";
        Set<String> companiesSet = LineRemoverUtil.creatSetFromFile(companiesFileUrl);
        Set<String> slovarSet = LineRemoverUtil.creatSetFromFile(slovarFileUlr);
        Set<String> result = lineRemover.removeElements(companiesSet, slovarSet);
        LineRemoverUtil.writeToFile(resultUrl, result);
    }

    @Before
    public Set prepareGlossary(FileReader glossary) throws IOException {
        new LineRemoverTest();
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
                System.out.println("Ошибка при закрытии потока");
                e1.printStackTrace();
            }
        } return glossaryInsSet;
    }

    @Test
    public void testRemoveElements() {
        FileReader fileSlovar = null;
        FileReader fileCompanies = null;
        this.setremovable = new LineRemover();
        try {
            fileSlovar = new FileReader("d:\\Development\\Projects\\line-remover\\src\\test\\resources\\TestSlovar.txt");
            Set<String> testGlossaryCompanies = prepareGlossary(fileSlovar);

            fileCompanies = new FileReader("d:\\Development\\Projects\\line-remover\\src\\test\\resources\\TestCompanies.txt");
            Set<String> testCheckingCompanies = prepareGlossary(fileCompanies);

            //Set<String> actualSet = setremovable.removeElements(testCheckingCompanies, testGlossaryCompanies);
            Set<String> expectedSet = new HashSet<String>();
            expectedSet.addAll(Arrays.asList("2", "4", "6", "8", "10", "12", "14", "16", "18", "20"));
            //Assert.assertEquals(expectedSet, actualSet);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e1) {
            System.out.println("Проблемы с чтением файла");
            e1.printStackTrace();
        }
        finally {
            try{
                if (fileSlovar != null)
                    fileSlovar.close();
                else System.out.println("Проблема при закрытии потока");
                if (fileCompanies != null)
                    fileCompanies.close();
                else System.out.println("Проблема при закрытии потока");
            }
            catch (IOException e2){
                e2.printStackTrace();
            }
        }

    }
}



