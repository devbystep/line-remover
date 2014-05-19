package by.minsler.list_remover;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;

/**
 * @author Aliaksei Pashkouski
 */
public class TestListRemover {

    private ListRemoverable listRemover;

    @Before
    public void prepareListRemover() {
        this.listRemover = new ListRemoverImpl();
    }

    @Test
    public void testStaticClass() {
        String testGlossaryPath = "d:/glossary.txt";
        String testCheckPath = "d:/check.txt";
        String testResultPath = "d:/result.txt";
        String testCheckResultPath = "d:/check_result.txt";
        Set<String> setGlossaryCompanies = ListRemoverUtil.createSetFromFile(testGlossaryPath);
        Set<String> setCheckingCompanies = ListRemoverUtil.createSetFromFile(testCheckPath);
        Set<String> setCheckResult = ListRemoverUtil.createSetFromFile(testCheckResultPath);
        Set<String> setResult = listRemover.getUniqueElements(setGlossaryCompanies, setCheckingCompanies);
        Assert.assertEquals(setCheckResult, setResult);
        ListRemoverUtil.writeSetToFile(setResult, testResultPath);
    }
}
