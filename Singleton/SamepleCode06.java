abstract class FileSystem {
  // SampleCode05
  
  public FileSystem instance() {
    if ("PS3FileSystem".equals(this.getClass().getName())) instance = new PS3FileSystem();
    else if ("WiiFileSystem".equals(this.getClass().getName())) instance = new WiiFileSystem();
  
  return instace;
  }
}
