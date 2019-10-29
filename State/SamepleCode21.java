class DuckingState {
  HeroineState handleInput(Heroine heroine, Input input) {
    if (input == RELEASE_DOWN) {
      return new StandingState();
    }
  }

  // Other code...
}
