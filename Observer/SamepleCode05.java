class Subject {
  protected void notify(Entity entity, Event event) {
    for (Observer obs: observers) {
      obs.onNotify(entity, event);
    }
  }

  // Other stuff...
}
