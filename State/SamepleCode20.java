class Heroine {
  void handleInput(Input input) {
    HeroineState heroineState = state.handleInput(this, input);
    if (heroineState != NULL) {
      state = heroineState;

      // Call the enter action on the new state.
      state.enter(this);
    }
  }
}
