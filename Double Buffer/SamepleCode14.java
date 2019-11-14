class Stage {
  void update() {
  for (int i = 0; i < NUM_ACTORS; i++) {
    actors[i].update();
  }

  for (int i = 0; i < NUM_ACTORS; i++) {
    actors[i].swap();
  }
}
