package by.minsler.lineremover;

import java.io.FileReader;
import java.io.IOException;
import java.util.Set;

/**
 * @author Dzmitry Varabei
 */
public interface LineRemovable {
   Set<String> removeElements(FileReader fileCompanies, FileReader fileSlovar) throws IOException;
}
