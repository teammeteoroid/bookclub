abstact class Actor {
  private boolean slapped;
  
  public Actor() {
    slapped = false;
  }
  
  public abstact void update();
  
  public void reset() {
    slapped = false;
  }
  
  public void slap() {
    slapped = true;
  }
  
  public boolean wasSlapped() {
    return slapped;
  }
}
