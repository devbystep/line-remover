package by.minsler.lineremover;

import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

/**
 * @author Dzmitry Varabei
 */
public interface LineRemovable {
   Set<String> removeElements(String companiesUrl, String slovarUrl) throws IOException;
    public void createFileBySet(String url, Set result)throws IOException;
    public Set<String> initGlossary(FileReader glossary) throws IOException;
}
