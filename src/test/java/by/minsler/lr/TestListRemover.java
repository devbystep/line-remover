package by.minsler.lr;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dzmitry Misiuk
 */
public class TestListRemover {

    private ListRemover listRemover;

    @Before
    public void prepareListRemover() {
        this.listRemover = new ListRemoverImpl();
    }

    @Test
    public void testGetDiffBetweenLists() {
        List<String> list1 = Arrays.asList("12", "32");
        List<String> list2 = Arrays.asList("12");
        List<String> actualList = listRemover.getDiffBetweenLists(list1, list2);
        List<String> expectedList = Arrays.asList("32");
        Assert.assertEquals(expectedList, actualList);
    }
}
