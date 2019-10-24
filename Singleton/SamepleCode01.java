class FileSystem {
  private static FileSystem instance;
  
  private FileSystem() {}
  
  public static FileSystem instance() {
    // Lazy initialize.
    if (instance == null) instance = new FileSystem();
	
	return instance;
  }
}
