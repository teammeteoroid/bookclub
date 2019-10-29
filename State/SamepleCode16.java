class Heroine {
  void handleInput(Input input) {
    HeroineState heroineState = state.handleInput(this, input);
    if (heroineState != NULL) {
      state = heroineState;
    }
  }
}
