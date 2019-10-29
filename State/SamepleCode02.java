class Heroine {
  void handleInput(Input input) {
    if (input == PRESS_B) {
      if (!isJumping) {
        isJumping = true;
        // Jump...
      }
    }
  }
}
