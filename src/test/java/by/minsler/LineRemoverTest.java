package by.minsler;

import by.minsler.lineremover.LineRemovable;
import by.minsler.lineremover.LineRemover;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Dzmitry Varabei
 */
public class LineRemoverTest {

    public Set<String> testGlossaryCompanies;
    public Set<String> testCheckingCompanies;
    private LineRemovable setremovable;

    @Before
    public void prepareListRemover() {

        this.setremovable = new LineRemover();
        testGlossaryCompanies = new HashSet<String>();
        testCheckingCompanies = new HashSet<String>();

        testGlossaryCompanies.addAll(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine"));

        testCheckingCompanies.addAll(Arrays.asList("one", "three", "ten", "eleven", "twenty"));

    }

    @Test
    public void testRemoveElements() {
        Set<String> actualSet = setremovable.removeElements(testCheckingCompanies, testGlossaryCompanies);
        Set<String> expectedSet = new HashSet<String>();
        expectedSet.addAll(Arrays.asList("eleven", "twenty", "ten"));
        Assert.assertEquals(expectedSet, actualSet);

    }
}

