class Heroine {
  void handleInput(Input input) {
    switch (state) {
      case STATE_STANDING:
        if (input == PRESS_B) {
          state = STATE_JUMPING;
          yVelocity = JUMP_VELOCITY;
          setGraphics(IMAGE_JUMP);
        } else if (input == PRESS_DOWN) {
          state = STATE_DUCKING;
          setGraphics(IMAGE_DUCK);
        }
        break;

      case STATE_JUMPING:
        if (input == PRESS_DOWN) {
          state = STATE_DIVING;
          setGraphics(IMAGE_DIVE);
        }
        break;

      case STATE_DUCKING:
        if (input == RELEASE_DOWN) {
          state = STATE_STANDING;
          setGraphics(IMAGE_STAND);
        }
        break;
    }
  }
}
