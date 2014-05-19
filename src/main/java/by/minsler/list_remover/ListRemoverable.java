package by.minsler.list_remover;

import java.util.Set;

/**
 * @author Aliaksei Pashkouski
 */
public interface ListRemoverable {

    Set<String> getUniqueElements(Set<String> set1, Set<String> set2);
}
