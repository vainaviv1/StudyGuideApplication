package cs3500.pa01.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * model
 */
public class StudySession {
  ArrayList<Question> questionsAsked = new ArrayList<>();
  ArrayList<Question> questionsArr;

  ArrayList<Question> hardQuestions = new ArrayList<>();
  ArrayList<Question> easyQuestions = new ArrayList<>();
  private int countEasyToHard= 0;
  private int countHardToEasy= 0;
  private int numQuestionsAsked;

  private int countHard= 0;
  private int countEasy= 0;

  private int count=0;

  private Question question;

  //private ArrayList<Question> questionBank = new ArrayList<Question>();

  /**
   *
   * @param questionsArr array of all questions in question bnk
   * @param numQuestionsAsked the number of questions the user asked for
   */
  public StudySession(ArrayList<Question> questionsArr, int numQuestionsAsked) {
  this.questionsArr = questionsArr;
  this.numQuestionsAsked = numQuestionsAsked;
}

  /**
   * returns array of random questions, amount requested by user
   * @param questionsArr -> array with all the questions in the question bank
   * @param numQuestionsAsked -> number of questions the user asks to study
   * @return ArrayList of questions
   */
  public ArrayList<Question> studySessionRun(ArrayList<Question> questionsArr, int numQuestionsAsked) {
    //this.questionBank = questionsArr;
    int ranIndex;
    int ranIndexOne;
    for (int j=0; j<questionsArr.size(); j++) {
      Question q = questionsArr.get(j);
      if (q.getDifficulty() == Difficulty.HARD) {
        hardQuestions.add(q);
      } else if (q.getDifficulty() == Difficulty.EASY) {
        easyQuestions.add(q);
      }
    }

    for (int i=0; i< numQuestionsAsked; i++) {
      if (!hardQuestions.isEmpty()){
        ranIndex = (int) (Math.random() * hardQuestions.size());
        Question question = hardQuestions.get(ranIndex);
        questionsAsked.add(question);
        hardQuestions.remove(question);
      } else {
        ranIndexOne = (int) (Math.random() * easyQuestions.size());
        Question question1 = easyQuestions.get(ranIndexOne);
        questionsAsked.add(question1);
        easyQuestions.remove(question1);

      }
    }
    return questionsAsked;
    }



//public void changeQB() {
//  for(int i = 0 ; i< questionsAsked.size(); i++) {
//    for(int j = 0 ; j< questionBank.size(); j++){
//      if(questionsAsked.get(i).getQuestion() == questionBank.get(j).getQuestion()) {
//        questionBank.get(j).getDifficulty() = questionsAsked.get(i).getDifficulty();
//      }
//    }
//  }
//}
//
//  public void hardVsEasy() {
//    for (int j = 0; j < questionBank.size(); j++) {
//      Question q = questionBank.get(j);
 //     if (q.getDifficulty() == Difficulty.HARD) {
 //       countHard++;
 //     } else if (q.getDifficulty() == Difficulty.EASY) {
  //      countEasy++;
 //     }
//    }
 // }


  /**
   * returns number of questions user asks
   * @return int number of questions asked
   */
  public int getNumQuestions() {
    return numQuestionsAsked;
  }

  /**
   * increases count of questions whose difficulty changed from easy to hard
   * @param questionObj a question object
   */
  public void changeEasyToHard(Question questionObj){
    if (count==0) {
      countEasyToHard++;
    } else {
      if (questionObj.getDifficulty().equals(Difficulty.EASY)) {
        countEasyToHard++;
        count++;
    }
    }
    questionObj.easyToHard();
  }
  /**
   * increases count of questions whose difficulty changed from hard to easy
   * @param questionObj a question object
   */
  public void changeHardToEasy(Question questionObj){
    if (questionObj.getDifficulty().equals(Difficulty.HARD)) {
      countHardToEasy++;
    }
    questionObj.hardToEasy();
  }

  /**
   * returns count of questions changed from easy to hard
   * @return count of questions changed from easy to hard (int)
   */
  public int getCountEasyToHard() {

    return countEasyToHard;
  }

  /**
   * returns count of questions changed from hard to easy
   * @return count of questions changed from hard to easy (int)
   */
  public int getCountHardToEasy() {

    return countHardToEasy;
  }

  /**
   * returns count of questions that are hard at the end
   * @return count of questions that are hard at the end
   */
  public int getHard() {
    return countHard;
  }
  /**
   * returns count of questions that are easy at the end
   * @return count of questions that are easy at the end
   */
  public int getEasy() {
    return countEasy;
  }

}
