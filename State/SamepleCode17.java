class StandingState {
  HeroineState handleInput(Heroine heroine, Input input) {
    if (input == PRESS_DOWN) {
      // Other code...
      return new DuckingState();
    }

    // Stay in this state.
    return NULL;
  }
}
