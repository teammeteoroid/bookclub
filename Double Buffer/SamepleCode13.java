abstact class Actor {
  private boolean currentSlapped;
  private boolean nextSlapped;
  
  public Actor() {
    currentSlapped = false;
  }
  
  public abstact void update();
  
  public void swap() {
    // Swap the buffer.
    currentSlapped = nextSlapped;
    // Clear the new "next" buffer.
    nextSlapped = false;
  }
  
  public void slap() {
    nextSlapped = true;
  }
  
  public boolean wasSlapped() {
    return currentSlapped;
  }
}
