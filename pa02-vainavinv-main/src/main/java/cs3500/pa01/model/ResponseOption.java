package cs3500.pa01.model;

/**
 * enums of response options, mark hard, mark easy, see answer, and exit
 */
public enum ResponseOption {

  /**
   * gives string "MARKHARD" to the enum MARKHARD
   */
  MARKHARD("MARKHARD"),

  /**
   * gives string "MARKEASY" to the enum MARKEASY
   */
  MARKEASY("MARKEASY"),

  /**
   * gives string "SEEANSWER" to the enum SEEANSWER
   */
  SEEANSWER("SEEANSWER"),

  /**
   * gives string "Exit" to the enum EXIT
   */
  EXIT("EXIT");

  /**
   *  string version of label of response option
   */
  public final String label;

  /**
   * initializes label of response option
   * @param label
   */
  private ResponseOption(String label) {

    this.label = label;
  }

  /**
   * returns string version of label of enum
   * @return label
   */
  public String returnLabel() {
    return label;
  }
}
