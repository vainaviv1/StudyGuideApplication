package cs3500.pa01;

import cs3500.pa01.model.Difficulty;
import cs3500.pa01.model.Question;
import cs3500.pa01.model.StudySession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudySessionTest {
  private StudySession studySession;
  private ArrayList<Question> questionsArr;

  @BeforeEach
  void setUp() {
    questionsArr = createSampleQuestions();
    studySession = new StudySession(questionsArr, 5);
  }

  @Test
  void studySessionRun() {
    ArrayList<Question> questionsAsked = studySession.studySessionRun(questionsArr, 5);

    assertEquals(5, questionsAsked.size());
    // Add more assertions based on the expected behavior
  }

  @Test
  void getNumQuestions() {
    int numQuestions = studySession.getNumQuestions();

    assertEquals(5, numQuestions);
  }

  @Test
  void changeEasyToHard() {
    Question question = new Question("Question 1", "Answer 1", Difficulty.EASY);
    studySession.changeEasyToHard(question);

    assertEquals(1, studySession.getCountEasyToHard());
    assertEquals(Difficulty.HARD, question.getDifficulty());
  }

  @Test
  void changeHardToEasy() {
    Question question = new Question("Question 2", "Answer 2", Difficulty.HARD);
    studySession.changeHardToEasy(question);

    assertEquals(1, studySession.getCountHardToEasy());
    assertEquals(Difficulty.EASY, question.getDifficulty());
  }

  // Helper method to create sample questions
  private ArrayList<Question> createSampleQuestions() {
    ArrayList<Question> questionsArr = new ArrayList<>();
    questionsArr.add(new Question("Question 1", "Answer 1", Difficulty.EASY));
    questionsArr.add(new Question("Question 2", "Answer 2", Difficulty.HARD));
    questionsArr.add(new Question("Question 3", "Answer 3", Difficulty.EASY));
    questionsArr.add(new Question("Question 4", "Answer 4", Difficulty.HARD));
    questionsArr.add(new Question("Question 5", "Answer 5", Difficulty.EASY));
    questionsArr.add(new Question("Question 6", "Answer 6", Difficulty.HARD));
    return questionsArr;
  }
}
