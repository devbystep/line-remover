package by.minsler;

import by.minsler.list_remover.LineRemover;
import by.minsler.list_remover.ListRemovable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

/**
 * author Dmitriy Vorobey
 */
public class TestListRemover {

    private ListRemovable listremovable;

    @Before
    public void prepareLisitRemover() {
        this.listremovable = new LineRemover();

    }

    @Test
    public void testRemoveElements () {
    List<String> list1 = Arrays.asList("16", "54", "78");
    List<String> list2 = Arrays.asList("16", "78");
    List<String> actualList = listremovable.removeElements(list1, list2);
    List<String> expectedList = Arrays.asList("54");
    Assert.assertEquals(expectedList, actualList);

        }
    }

