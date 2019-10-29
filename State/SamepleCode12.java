class DuckingState implements public HeroineState {
  private int chargeTime;
  
  public DuckingState() {
    chargeTime = 0;
  }
  
  @Override
  public void handleInput(Heroine heroine, Input input) {
    if (input == RELEASE_DOWN) {
      // Change to standing state...
      heroine.setGraphics(IMAGE_STAND);
    }
  }

  @Override
  public void update(Heroine heroine) {
    chargeTime++;
    if (chargeTime > MAX_CHARGE) {
      heroine.superBomb();
    }
  }
}
