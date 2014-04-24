package by.minsler.list_remover;

import java.util.HashSet;
import java.util.Set;

/**
 * author Dzmitry Varabei
 */
public class SetsPrepareer {

    public Set<String> prepareGlossaryCompanies(){

    Set<String> glossaryCompanies = new HashSet<String>();
    glossaryCompanies.add("one");
    glossaryCompanies.add("two");
    glossaryCompanies.add("three");
    glossaryCompanies.add("four");
    glossaryCompanies.add("five");
    glossaryCompanies.add("six");
    glossaryCompanies.add("seven");
    glossaryCompanies.add("eight");
    glossaryCompanies.add("nine");

        return (glossaryCompanies);
    }
    public Set<String> prepareCheckingCompanies(){

    Set<String> checkingCompanies = new HashSet<String>();
        checkingCompanies.add("one");
        checkingCompanies.add("thirty");
        checkingCompanies.add("three");
        checkingCompanies.add("ten");
        checkingCompanies.add("eleven");
        return (checkingCompanies);
    }
}