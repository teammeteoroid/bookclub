class Heroine {
  void handleInput(Input input) {
    state.handleInput(this, input);
    equipment.handleInput(this, input);
  }
}
