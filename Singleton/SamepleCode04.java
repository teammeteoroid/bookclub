public class PS3FileSystem implements FileSystem {
  public String readFile(Path path) {
    // Use Sony file IO API...
  }
  
  public void writeFile(Path path, String contents) {
    // Use sony file IO API...
  }
}

public class WiiFileSystem implements FileSystem {
  public String readFile(Path path) {
    // Use Nintendo file IO API...
  }
  
  public void writeFile(Path path, String contents) {
    // Use Nintendo file IO API...
  }
}
