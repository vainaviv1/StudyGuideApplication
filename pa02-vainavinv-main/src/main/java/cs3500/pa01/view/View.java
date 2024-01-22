package cs3500.pa01.view;

import cs3500.pa01.model.Question;
import cs3500.pa01.model.ResponseOption;
import java.io.IOException;
import java.util.Scanner;

/**
 * view, in charge of what's displayed to users
 */
public class View {
  private Appendable appendable;
  private Scanner sc = new Scanner(System.in);

  /**
   * view, in charge of what's displayed to users
   */
  public View() {

  }

  /**
   * view constructor
   * @param appendable output
   */
  public View(Appendable appendable) {

    this.appendable = appendable;
    //sc = new Scanner(System.in);
  }

  /**
   * prints statements
   * @param input - user input
   */
  public void printStatement (String input) {
    try {
      appendable.append(input);
    } catch (IOException e) {
      throw new IllegalStateException("Cannot append");
    }
  }

  /**
   * prints question to user
   * @param question object
   */
  public void printQuestion(Question question) {

    System.out.println(question.getQuestion());
  }


  /**
   * prints response options to user
   */
  public void questionOptions() {
    System.out.println(ResponseOption.MARKEASY);
    System.out.println(ResponseOption.MARKHARD);
    System.out.println(ResponseOption.SEEANSWER);
    System.out.println((ResponseOption.EXIT));
  }

  /**
   * gets the user input (response option they chose)
   * @return user input (next line)
   */
  public String getUserOptions() {
    return sc.nextLine();
  }

  /**
   * prints answer to user
   * @param question object
   */
  public void printAnswer(Question question) {

    System.out.println("The Answer is: " + question.getAnswer());
  }


}
