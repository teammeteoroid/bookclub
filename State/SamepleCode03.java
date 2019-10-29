class Heroine {
  void handleInput(Input input) {
    if (input == PRESS_B) {
      // Jump if not jumping...
    } else if (input == PRESS_DOWN) {
      if (!isJumping) {
        setGraphics(IMAGE_DUCK);
      }
    } else if (input == RELEASE_DOWN) {
      setGraphics(IMAGE_STAND);
    }
  }
}
