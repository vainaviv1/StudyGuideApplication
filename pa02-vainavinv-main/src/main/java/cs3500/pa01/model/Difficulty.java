package cs3500.pa01.model;

/**
 * Difficulty options, hard, or easy
 */
public enum Difficulty {
  /**
   * hard enum, represents hard difficulty
   */
  HARD("hard"),
  /**
   * easy enum, represents easy difficulty
   */
  EASY("easy");

  /**
   * initializes label for difficulty (String form)
   */
  public final String label;

  /** returns label for the difficulty enum
   * @param label (String)
   * @return label (enum)
   */
  private Difficulty(String label) {
    this.label = label;
  }
}
