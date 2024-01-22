//package cs3500.pa01;
//
//import cs3500.pa01.model.Difficulty;
//import cs3500.pa01.model.Question;
//import cs3500.pa01.model.QuestionBankMaker;
//import java.nio.file.Files;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class QuestionBankMakerTest {
//  private QuestionBankMaker questionBankMaker;
//
//  @BeforeEach
//  void setUp() {
//    questionBankMaker = new QuestionBankMaker();
//  }
//
//  @Test
//  void QuestionBankMaker() {
//    // Create a temporary file with sample questions
//    File tempFile = createTempFileWithQuestions();
//
//    // Call the QuestionBankMaker method
//    ArrayList<Question> questionsArr = questionBankMaker.QuestionBankMaker(tempFile);
//
//    // Verify the result
//    assertEquals(2, questionsArr.size());
//    assertEquals("Question 1", questionsArr.get(0).getQuestion());
//    assertEquals("Answer 1", questionsArr.get(0).getAnswer());
//    assertEquals(Difficulty.EASY, questionsArr.get(0).getDifficulty());
//    assertEquals("Question 2", questionsArr.get(1).getQuestion());
//    assertEquals("Answer 2", questionsArr.get(1).getAnswer());
//    assertEquals(Difficulty.HARD, questionsArr.get(1).getDifficulty());
//
//    // Delete the temporary file
//    tempFile.delete();
//  }
//
//  private File createTempFileWithQuestions() {
//    try {
//      File tempFile = File.createTempFile("questions", ".sr");
//      String content = "[Easy] Question 1: Answer 1\n" +
//          "[Hard] Question 2: Answer 2";
//      Files.write(tempFile.toPath(), content.getBytes());
//      return tempFile;
//    } catch (IOException e) {
//      e.printStackTrace();
//      return null;
//    }
//  }
//}
