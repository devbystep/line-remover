package by.minsler.lineremover;

import java.util.Set;

/**
 * @author Dzmitry Varabei
 */
public interface LineRemovable {
   Set<String> removeElements(Set<String> set1, Set<String> set2);
}
