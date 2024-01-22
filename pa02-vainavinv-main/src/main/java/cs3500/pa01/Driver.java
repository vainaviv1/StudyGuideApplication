package cs3500.pa01;

import cs3500.pa01.controller.ControllerSG;
import cs3500.pa01.controller.ControllerSS;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * driver class
 */
public class Driver {
  /**
   * driver, the main class
   * @param args, could be 3 (SG) or 0 (SS), or if not, throws an exception
   * @throws IOException if an invalid number of arguments is entered
   */
  public static void main(String[] args) throws IOException {
    if (args.length == 3) {
      String pathInput = args[0];
      String orderingFlag = args[1];
      String pathOutput = args[2];
      ControllerSG cg = new ControllerSG(pathInput, orderingFlag, pathOutput);
    }
    else if (args.length == 0) {
      ControllerSS cs = new ControllerSS(new InputStreamReader(System.in), System.out);
      cs.run();
    } else {
      throw new IllegalArgumentException("invalid number of arguments.");
    }


  }
}
