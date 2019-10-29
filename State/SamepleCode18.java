class DuckingState {
  HeroineState handleInput(Heroine heroine, Input input) {
    if (input == RELEASE_DOWN) {
      heroine.setGraphics(IMAGE_STAND);
      return new StandingState();
    }
  }

  // Other code...
}
