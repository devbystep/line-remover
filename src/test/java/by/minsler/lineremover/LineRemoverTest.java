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
        String companiesUrl = null;
        String slovarUrl = null;
        String resultUrl = null;
        FileReader fileResult = null;

        try {
            Set<String> result = lineremovable.removeElements(companiesUrl, slovarUrl);
            lineremovable.createFileBySet(resultUrl, result);

            fileResult = new FileReader(resultUrl);
            Set actualSet = lineremovable.initGlossary(fileResult);

            Set<String> expectedSet = new HashSet<String>();
            expectedSet.addAll(Arrays.asList("2", "4", "6", "8", "10", "12", "14", "16", "18", "20"));
            Assert.assertEquals(expectedSet, actualSet);
        } catch (IOException e1) {
            System.out.println("Проблемы с чтением файла");
            e1.printStackTrace();
        }

    }
}



