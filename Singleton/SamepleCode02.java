class FileSystem {
  private static FileSystem instance;
  
  private FileSystem() {}
  
  public static FileSystem instance() {
    if (instance == null) {
      synchronized (FileSystem.class) {
        if (instance == null) instance = new FileSystem();
	  }
	}
	
	return instance;
  }
}
