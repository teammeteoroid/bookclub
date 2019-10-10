class Physics {
  void updateEntity(Entity entity) {
    bool wasOnSurface = entity.isOnSurface();
    entity.accelerate(GRAVITY);
    entity.update();
    if (wasOnSurface && !entity.isOnSurface()) notify(entity, EVENT_START_FALL);
  }
}
