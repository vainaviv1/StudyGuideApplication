//package cs3500.pa01;
//
//import cs3500.pa01.controller.ControllerSS;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.InputStream;
//import java.io.PrintStream;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class ControllerSSTest {
//  private ControllerSS controllerSS;
//  private InputStream testInput;
//  private ByteArrayOutputStream testOutput;
//
//  @BeforeEach
//  void setUp() {
//    testInput = new ByteArrayInputStream("input\n3\n".getBytes());
//    testOutput = new ByteArrayOutputStream();
//    controllerSS = new ControllerSS((Readable) testInput, new PrintStream(testOutput));
//  }
//
//  @Test
//  void run() {
//    controllerSS.run();
//
//    String expectedOutput = "Welcome to your study Session!\n" +
//        " Please input an sr file path\n" +
//        "Please input the number of questions you want to study\n" +
//        "Question 1\n" +
//        "Options\n" +
//        "User input 1\n" +
//        "Question 2\n" +
//        "Options\n" +
//        "User input 2\n" +
//        "Question 3\n" +
//        "Options\n" +
//        "User input 3\n" +
//        "\n" +
//        "Good Job!\n" +
//        "\n" +
//        "You answered this many questions:3.\n" +
//        "\n" +
//        "0 questions went from easy to hard.\n" +
//        "\n" +
//        "0 questions went from hard to easy.\n" +
//        "\n" +
//        "Current Counts in Question Bank:\n" +
//        "\n" +
//        "0 Hard Questions\n" +
//        "\n" +
//        "0 Easy Questions\n" +
//        "\n";
//
//    assertEquals(expectedOutput, testOutput.toString());
//  }
//
//}

