package cs3500.pa01;

import cs3500.pa01.view.WriteFileSR;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WriteFileSRTest {
  private WriteFileSR writeFileSR;
  private File testFile;

  @BeforeEach
  void setUp() {
    writeFileSR = new WriteFileSR();
    testFile = new File("testFile.sr");
  }

  @Test
  void writeToFileSR() throws IOException {
    String contents = "Sample SR file contents";
    writeFileSR.writeToFileSR(testFile, contents);

    assertTrue(testFile.exists());
    String fileContent = Files.readString(Path.of(testFile.toURI()));
    assertEquals(contents, fileContent);

    // Clean up the test file
    testFile.delete();
  }
}

