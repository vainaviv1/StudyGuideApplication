package cs3500.pa01;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;


/**
 * converts path to file
 */
public class Utils {

  /**
   * converts path to file
   * @param paths of files
   * @return files the files being converted from path
   */
  public static ArrayList<File> convertPathToFile(ArrayList<Path> paths) {
    ArrayList<File> files = new ArrayList<>();
    for (Path path : paths) {
      files.add(path.toFile());
    }
    return files;
  }
}
