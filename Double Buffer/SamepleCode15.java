class Actor {
  private static int current;
  
  private boolean[] slapped = new boolean[2];
  
  public static void init() {
    current = 0;
  }
  
  public static void swap() {
    current = next();
  }
  
  public void slap() {
    slapped[next()] = true;
  }
  
  public boolean wasSlapped() {
    return slapped[current];
  }
  
  private static int next() {
    return 1 - current;
  }
}
