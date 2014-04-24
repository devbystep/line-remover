package by.minsler;

import by.minsler.list_remover.LineRemovable;
import by.minsler.list_remover.LineRemover;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * author Dzmitry Varabei
 */
public class TestLineRemover {

    private LineRemovable setremovable;
    public Set<String> testGlossaryCompanies;
    public Set<String> testCheckingCompanies;

    @Before
    public void prepareLisitRemover() {

    this.setremovable = new LineRemover();
    testGlossaryCompanies = new HashSet<String>();
    testCheckingCompanies = new HashSet<String>();

        testGlossaryCompanies.add("one");
        testGlossaryCompanies.add("two");
        testGlossaryCompanies.add("three");
        testGlossaryCompanies.add("four");
        testGlossaryCompanies.add("five");
        testGlossaryCompanies.add("six");
        testGlossaryCompanies.add("seven");
        testGlossaryCompanies.add("eight");
        testGlossaryCompanies.add("nine");

        testCheckingCompanies.add("one");
        testCheckingCompanies.add("three");
        testCheckingCompanies.add("ten");
        testCheckingCompanies.add("eleven");
        testCheckingCompanies.add("twenty");

    }

    @Test
    public void testRemoveElements () {
    Set<String> actualSet = setremovable.removeElements(testCheckingCompanies,testGlossaryCompanies);
    Set<String> expectedSet = new HashSet<String>();
        expectedSet.add("eleven");
        expectedSet.add("ten");
        expectedSet.add("twenty");
    Assert.assertEquals(expectedSet, actualSet);

        }
    }

