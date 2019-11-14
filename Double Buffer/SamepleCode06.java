class Stage {
  private static final int NUM_ACTORS = 3;
  
  private Actor[] actors = new Actor[NUM_ACTORS];
  
  public void add(Actor actor, int index) {
    actors[index] = actor;
  }
  
  public void update() {
    for (int i = 0; i < NUM_ACTORS; i++) {
      actors[i].update();
      actors[i].reset();
    }
  }
}
