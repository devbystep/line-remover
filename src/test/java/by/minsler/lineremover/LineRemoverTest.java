package by.minsler.lineremover;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Dzmitry Varabei
 */
public class LineRemoverTest {

    private LineRemovable lineremovable;

    @Before
    public void prepareGlossary() {
        this.lineremovable = new LineRemover();
    }

    @Test
    public void testRemoveElements() {
        String companiesUrl = "d:\\Development\\Projects\\line-remover\\src\\test\\resources\\TestCompanies.txt";
        String slovarUrl = "d:\\Development\\Projects\\line-remover\\src\\test\\resources\\TestSlovar.txt";
        String resultUrl = "d:\\Development\\Projects\\line-remover\\src\\test\\resources\\NotFoundCompanies.txt";
        FileReader fileResult = null;

        try {
            Set<String> result = lineremovable.removeElements(companiesUrl, slovarUrl);
            lineremovable.createFileBySet(resultUrl, result);

            fileResult = new FileReader(resultUrl);
            Set actualSet = lineremovable.initGlossary(fileResult);

            Set<String> expectedSet = new HashSet<String>();
            expectedSet.addAll(Arrays.asList("33", "44", "55", "66", "77", "88", "99", "22", "111", "222", "тест"));
            Assert.assertEquals(expectedSet, actualSet);
        } catch (IOException e1) {
            System.out.println("Проблемы с чтением файла");
            e1.printStackTrace();
        }
    }
}