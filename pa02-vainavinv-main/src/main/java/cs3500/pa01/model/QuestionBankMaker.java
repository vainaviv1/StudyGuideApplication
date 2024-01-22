package cs3500.pa01.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * the class that makes an arraylist of all the questions in the question bank (sr file)
 */
public class QuestionBankMaker {

  /**
   * reads through sr file and creates an ArrayList with all the questions in the file
   * @param file file with all the questions, question bank
   * @return ArrayList of all the questions in the sr file
   */
  public ArrayList QuestionBankMaker(File file) {
  ArrayList<Question> questionsArr = new ArrayList<Question>();
  try (Scanner scanner = new Scanner(file)) {
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String dif = (line.substring(((line.indexOf("]"))-4), (line.indexOf("]")))).toUpperCase();
      String q= (line.substring(4, (line.indexOf(":"))));
      String a= (line.substring(((line.indexOf(":"))+3), ((line.indexOf("]"))-7)));
      Question quest = new Question(q,a,(Difficulty.valueOf(dif)));
      questionsArr.add(quest);
    }
  } catch (IOException e) {
      System.err.println("Error occurred while reading file: " + file.getName());
    }
    return questionsArr;
  }
}

