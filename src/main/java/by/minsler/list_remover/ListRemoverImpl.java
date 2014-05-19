package by.minsler.list_remover;

import java.util.Set;

/**
 * @author Aliaksei Pashkouski
 */
public class ListRemoverImpl implements ListRemoverable {
    @Override
    public Set<String> getUniqueElements(Set<String> setGlossaryCompanies, Set<String> setCheckingCompanies){
        setCheckingCompanies.removeAll(setGlossaryCompanies);
    return setCheckingCompanies;
    }
}
