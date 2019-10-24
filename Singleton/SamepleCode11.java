class FileSystem {
  private static boolean instantiated;
  
  public FileSystem() {
    assert !instantiated;
    instantiated = true;
  }
}

boolean FileSystem.instantiated = false;
