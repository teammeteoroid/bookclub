interface FileSystem {
  public String readFile(Path path);
  public void writeFile(Path path, String contents);
}
