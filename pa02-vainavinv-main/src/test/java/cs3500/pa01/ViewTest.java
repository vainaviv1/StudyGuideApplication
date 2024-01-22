package cs3500.pa01;

import cs3500.pa01.model.Difficulty;
import cs3500.pa01.model.Question;
import cs3500.pa01.view.View;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ViewTest {
  private View view;
  private ByteArrayOutputStream outputStream;

  @BeforeEach
  void setUp() {
    outputStream = new ByteArrayOutputStream();
    view = new View(new PrintStream(outputStream));
  }

  @Test
  void printStatement() {
    String statement = "Welcome to the Study App!";
    view.printStatement(statement);

    assertEquals(statement, outputStream.toString().trim());
  }

//  @Test
//  void printQuestion() {
//    Question question = new Question("Question 1", "Answer 1", Difficulty.EASY);
//    view.printQuestion(question);
//
//    assertEquals("Question 1", view.printQuestion(question));
//  }

//  @Test
//  void questionOptions() {
//    String expectedOutput = "MARK EASY\nMARK HARD\nSEE ANSWER\nEXIT";
//    view.questionOptions();
//
//    assertEquals(expectedOutput, outputStream.toString().trim());
//  }

//  @Test
//  void getUserOptions() throws IOException {
//    String userInput = "1";
//    System.setIn(new java.io.ByteArrayInputStream(userInput.getBytes()));
//
//    String userOption = view.getUserOptions();
//
//    assertEquals(userInput, userOption);
//  }

//  @Test
//  void printAnswer() {
//    Question question = new Question("Question 1", "Answer 1", Difficulty.EASY);
//    view.printAnswer(question);
//
//    assertEquals("The Answer is: Answer 1", outputStream.toString().trim());
//  }
}
