class Heroine {
  void handleInput(Input input) {
    if (input == PRESS_B) {
      yVelocity = JUMP_VELOCITY;
      setGraphics(IMAGE_JUMP);
    }
  }
}
