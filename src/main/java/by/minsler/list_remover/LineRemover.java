package by.minsler.list_remover;

import java.util.Set;

/**
 * author Dzmitry Varabei
 */
public class LineRemover implements LineRemovable {

    @Override
    public Set<String> removeElements(Set<String> set1, Set<String> set2) {
    set1.removeAll(set2);
        return (set1);
       }

    public static void main(String [] args){
        SetsPrepareer sp = new SetsPrepareer();
        LineRemover lr = new LineRemover();
        System.out.println(lr.removeElements(sp.prepareCheckingCompanies(),sp.prepareGlossaryCompanies()));
    }
}
