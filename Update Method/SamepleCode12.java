class Entity {
  void update() {
    // Forward to state object.
    state.update();
  }
}
