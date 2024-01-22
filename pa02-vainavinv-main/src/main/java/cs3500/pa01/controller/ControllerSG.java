package cs3500.pa01.controller;

import cs3500.pa01.Utils;
import cs3500.pa01.model.ReadFile;
import cs3500.pa01.model.SortFile;
import cs3500.pa01.model.VisitFile;
import cs3500.pa01.view.WriteFile;
import cs3500.pa01.view.WriteFileSR;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * controller for creating study guide and returning sr file
 */
public class ControllerSG implements ControllerInt {
  String pathInput;
  String orderingFlag;
  String pathOutput;

  /**
   * ControllerSG is the controller for creating a study guide from multiple files,
   * and return a sr file with questions from the files
   * @param pathInput path to the files being inputted
   * @param orderingFlag ordering flag, how files should be sorted
   * @param pathOutput path to the output file for the stuff in the files
   * @throws IOException if wrong arguments are passed in
   */
  public ControllerSG(String pathInput, String orderingFlag, String pathOutput) throws IOException {
    pathInput = pathInput;
    orderingFlag = orderingFlag;
    pathOutput = pathOutput;

      Path notesRoot = Path.of(pathInput);
      ArrayList<Path> list = new ArrayList<>();
      VisitFile vf = new VisitFile(list);
      Files.walkFileTree(notesRoot, vf);
      ArrayList<Path> retVal = vf.getList();
      for (Path path : retVal) {
        System.out.println(path);
      }

      ArrayList<File> files = Utils.convertPathToFile(retVal);
      ArrayList<File> sortedList = SortFile.sortFile(files, orderingFlag);
      ReadFile fr = new ReadFile();
      String content = fr.readFromFile(files);
      String contentOne = fr.readFromFileSR(files);

      Path po = Path.of(pathOutput);
      File fileOutput = po.toFile();
      WriteFile wf = new WriteFile();
      wf.writeToFile(fileOutput, content);

    Path p = Path.of(pathOutput);
    String fileName = p.toString();
    String newFileName = fileName.substring(0, fileName.length()-3) +".sr";
    Path newP = Path.of(newFileName);
    File fiOutput = newP.toFile();
    WriteFileSR sr = new WriteFileSR();
    sr.writeToFileSR(fiOutput, contentOne);
    }

  @Override
  public void run() {

  }
}

