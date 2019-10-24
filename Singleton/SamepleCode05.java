abstract class FileSystem {
  protected FileSystem() {}
  
  public static FileSystem instance();
  
  public abstract String readFile(Path path);
  public abstract void writeFile(Path path, String contents);
}
