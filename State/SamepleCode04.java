class Heroine {
  void handleInput(Input input) {
    if (input == PRESS_B) {
        if (!isJumping && !isDucking) {
          // Jump...
      }
    } else if (input == PRESS_DOWN) {
      if (!isJumping) {
        isDucking = true;
        setGraphics(IMAGE_DUCK);
      }
    } else if (input == RELEASE_DOWN) {
      isDucking = false;
      setGraphics(IMAGE_STAND);
    }
  }
}
