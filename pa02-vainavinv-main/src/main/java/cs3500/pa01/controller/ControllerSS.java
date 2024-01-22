package cs3500.pa01.controller;

import static cs3500.pa01.model.ResponseOption.EXIT;
import static cs3500.pa01.model.ResponseOption.MARKEASY;
import static cs3500.pa01.model.ResponseOption.MARKHARD;
import static cs3500.pa01.model.ResponseOption.SEEANSWER;

import cs3500.pa01.model.Question;
import cs3500.pa01.model.QuestionBankMaker;
import cs3500.pa01.model.StudySession;
import cs3500.pa01.view.View;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * controller for starting study session
 */

public class ControllerSS implements ControllerInt {

  /**
   * readable, input
   */
  private Readable readable;

  /**
   * object of view
   */
  private View view;

  private StudySession model;

  /**
   * controller for starting a study session
   * @param readable input
   * @param appendable output
   */
  public ControllerSS(Readable readable, Appendable appendable) {
    this.readable = readable;
    this.view = new View(appendable);
  }
  public void run() {
    view.printStatement("Welcome to your study Session!\n" + " Please input an sr file path\n");

    Scanner sc = new Scanner(readable);
    String userInput = sc.nextLine();
    Path newFP = Path.of(userInput);
    File srFile = newFP.toFile();

    if (!srFile.exists()) {
      throw new IllegalArgumentException("");
    }

    QuestionBankMaker qb = new QuestionBankMaker();
    ArrayList<Question> questionsArr = qb.QuestionBankMaker(srFile);
    view.printStatement("Please input the number of questions you want to study\n");
    int questionCount = sc.nextInt();
    if (questionCount>questionsArr.size()) {
      questionCount=questionsArr.size();
    }
    StudySession ss = new StudySession(questionsArr, questionCount);
    ArrayList<Question> questionsAsked = ss.studySessionRun(questionsArr, questionCount);
    for (int i = 0; i < questionsAsked.size(); i++) {
      Question question;
      question = questionsAsked.get(i);
      View v = new View();
      v.printQuestion(question);

      v.questionOptions();
      String userIn = v.getUserOptions();

      if (userIn.equals(MARKEASY.returnLabel())) {
       ss.changeEasyToHard(question);
      } else if (userIn.equals(MARKHARD.returnLabel())) {
        ss.changeHardToEasy(question);
      } else if (userIn.equals(SEEANSWER.returnLabel())) {
        v.printAnswer(question);
      } else if (userIn.equals(EXIT.returnLabel())) {
        i = questionsAsked.size();
      } else {
        throw new IllegalArgumentException("Input does not match response options");
      }
      //ss.changeQB();
    }

    view.printStatement("\n"+"Good Job!"+"\n"+"\n" );
    view.printStatement("You answered this many questions:"+ss.getNumQuestions()+"." +"\n"+"\n");
    view.printStatement(ss.getCountEasyToHard() + " questions went from easy to hard." +"\n"+"\n");
    view.printStatement(ss.getCountHardToEasy() + " questions went from hard to easy." +"\n"+"\n");
    view.printStatement("Current Counts in Question Bank:"+"\n"+"\n" );
    view.printStatement(ss.getHard()+" Hard Questions"+"\n"+"\n");
    view.printStatement(ss.getEasy()+" Easy Questions"+"\n"+"\n");


  }
}
