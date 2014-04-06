package by.minsler.lr;

import java.util.List;

/**
 * @author Dzmitry Misiuk
 */
public interface ListRemover {

    List<String> getDiffBetweenLists(List<String> list1, List<String> list2);
}