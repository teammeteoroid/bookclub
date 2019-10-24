class FileSystem {
  private static FileSystem instance;
  
  private FileSystem() {}
  
  public static FileSystem instace() {
    return instance;
  }
}
