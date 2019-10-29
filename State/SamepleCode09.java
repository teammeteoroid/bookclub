class Heroine {
  void handleInput(Input input) {
    switch (state) {
      case STATE_STANDING:
        if (input == PRESS_DOWN) {
          state = STATE_DUCKING;
          chargeTime = 0;
          setGraphics(IMAGE_DUCK);
        }
        // Handle other inputs...
        break;
  
        // Other states...
    }
  }
}
