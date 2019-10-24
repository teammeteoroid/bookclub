class Game {
  private static Game instance;

  private Log log;
  private FileSystem fileSystem;
  private AudioPlayer audioPlayer;
  
  public static Game instance() {
    return instance;
  }

  // Functions to set log_, et. al. ...

  public Log getLog() {
    return log;
  }
  
  public FileSystem getFileSystem() {
    return fileSystem;
  }
  
  public AudioPlayer getAudioPlayer() {
    return audioPlayer;
  }
}
