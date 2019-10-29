public class DuckingState extends OnGroundState {
  @Override
  public void handleInput(Heroine heroine, Input input) {
    if (input == RELEASE_DOWN) {
      // Stand up...
    } else {
      // Didn't handle input, so walk up hierarchy.
      super(heroine, input);
    }
  }
}
