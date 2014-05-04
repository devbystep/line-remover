package by.minsler.lineremover;

import java.util.Set;

/**
 * @author Dzmitry Varabei
 */
public class LineRemover implements LineRemovable {

    @Override
    public Set<String> removeElements(Set<String> set1, Set<String> set2) {
    set1.removeAll(set2);
        return (set1);
    }

}
