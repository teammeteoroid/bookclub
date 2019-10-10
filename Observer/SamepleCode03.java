public class Achievements implements Observer {
  private boolean heroIsOnBridge;
  
  private void unlock(Achievement achievement) {
    // Unlock if not already unlocked...
  }
  
  public void onNotify(Entity entity, Event event) {
    switch (event) {
    case EVENT_ENTITY_FELL:
      if (entity.isHero() && heroIsOnBridge) unlock(ACHIEVEMENT_FELL_OFF_BRIDGE);
      break;

      // Handle other events, and update heroIsOnBridge_...
    }
  }
}
