import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {

    @Test
    public void secondFile() throws IOException {
        
        ArrayList<String> links = new ArrayList<String>();

        links.add("https://something.com");
        links.add("some-thing.html");

        String content = Files.readString(Path.of("test-file.md"));
        
        ArrayList<String> parsedLinks = MarkdownParse.getLinks(content);
        
        assertEquals(links, parsedLinks);
    }
}

/**
 * javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
 * java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
 */