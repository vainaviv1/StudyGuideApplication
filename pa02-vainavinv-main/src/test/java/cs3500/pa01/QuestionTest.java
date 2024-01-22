package cs3500.pa01;

import cs3500.pa01.model.Difficulty;
import cs3500.pa01.model.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionTest {
  private Question question;

  @BeforeEach
  void setUp() {
    // Create a new Question object for each test
    question = new Question("What is the capital of France?", "Paris", Difficulty.EASY);
  }

  @Test
  void getQuestion() {
    // Verify the getQuestion() method returns the correct question
    assertEquals("What is the capital of France?", question.getQuestion());
  }

  @Test
  void getAnswer() {
    // Verify the getAnswer() method returns the correct answer
    assertEquals("Paris", question.getAnswer());
  }

  @Test
  void getDifficulty() {
    // Verify the getDifficulty() method returns the correct difficulty
    assertEquals(Difficulty.EASY, question.getDifficulty());
  }

  @Test
  void easyToHard() {
    // Call the easyToHard() method to change the difficulty
    question.easyToHard();

    // Verify the difficulty has been changed to HARD
    assertEquals(Difficulty.HARD, question.getDifficulty());
  }

  @Test
  void hardToEasy() {
    // Call the hardToEasy() method to change the difficulty
    question.hardToEasy();

    // Verify the difficulty has been changed to EASY
    assertEquals(Difficulty.EASY, question.getDifficulty());
  }
}
