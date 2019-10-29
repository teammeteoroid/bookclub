public abstract class OnGroundState implements HeroineState {
  public void handleInput(Heroine heroine, Input input) {
    if (input == PRESS_B) {
      // Jump...
    } else if (input == PRESS_DOWN) {
      // Duck...
    }
  }
}
