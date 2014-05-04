package by.minsler.lineremover;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Dzmitry Varabei
 */
public class SetsPrepareer {

    public Set<String> prepareGlossaryCompanies() {

        Set<String> glossaryCompanies = new HashSet<String>();
        glossaryCompanies.addAll(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"));

        return (glossaryCompanies);
    }

    public Set<String> prepareCheckingCompanies() {

        Set<String> checkingCompanies = new HashSet<String>();
        checkingCompanies.addAll(Arrays.asList("one", "thirty", "three", "ten", "eleven", "forty"));

        return (checkingCompanies);
    }
}