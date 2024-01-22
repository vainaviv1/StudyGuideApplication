package cs3500.pa01;

import cs3500.pa01.model.Difficulty;
import org.junit.jupiter.api.BeforeEach;
public class DifficultyTest {
  private Difficulty hardDifficulty;
  private Difficulty easyDifficulty;

  @BeforeEach
   void setUp() {
    hardDifficulty = Difficulty.HARD;
    easyDifficulty = Difficulty.EASY;
  }

 // @Test
  //void getLabel() {
   // assertEquals("hard", Difficulty.HARD.getLabel());
 //   assertEquals("easy", Difficulty.EASY.getLabel());
  //}
}
