package by.minsler.list_remover;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Aliaksei Pashkouski
 */
public class TestListRemover {

    private ListRemover listRemover;

    @Before
    public void prepareListRemover() {
        this.listRemover = new ListRemoverImpl();
    }

    @Test
    public void testGetUniqueElements() {
        List<String> list1 = Arrays.asList("23", "434", "866", "19", "1024", "988");
        List<String> list2 = Arrays.asList("14", "23", "866", "28");
        List<String> actualList = listRemover.getUniqueElements(list1, list2);
        List<String> expectedList = Arrays.asList("14", "28");
        Assert.assertEquals(actualList, expectedList);
    }

}
