package cs3500.pa01.model;

/**
 * class representing changes and properties of one question
 */
public class Question {
   private String question;
  private String answer;

  private Difficulty diff;

  /**
   * gives value to the different parts of a question object
   * @param question - the question
   * @param answer answer to question
   * @param diff difficulty
   */
  public Question(String question, String answer, Difficulty diff){
    this.question = question;
    this.answer = answer;
    this.diff = diff;

  }

  /**
   *
   * @return question part of a question object
   */
  public String getQuestion() {
      return this.question;
  }

  /**
   *
   * @return answer part of a question object
   */
  public String getAnswer() {
    return this.answer;
  }


  /**
   *
   * @return difficulty part of a question object
   */
  public Difficulty getDifficulty() {
    return this.diff;
  }

  /**
   * changes difficulty of a question from easy to hard
   */
  public void easyToHard(){
    this.diff = Difficulty.HARD;
  }

  /**
   * changes difficulty of a question from hard to easy
   */
  public void hardToEasy(){
    this.diff = Difficulty.EASY;
  }


}

