public class Comedian extends Actor {
  private Actor facing;
  
  public void face(Actor actor) {
    facing = actor;
  }
  
  public void update() {
    if (wasSlapped()) facing.slap();
  }
}
