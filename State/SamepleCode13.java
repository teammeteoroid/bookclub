class Heroine {
  private HeroineState state;
  
  public void handleInput(Input input) {
    state.handleInput(this, input);
  }

  public void update() {
    state.update(this);
  }

  // Other methods...
}
