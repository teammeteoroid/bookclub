public class Ghost extends Monster {
  private int health;
  private int speed;
  
  public Ghost(int health, int speed) {
    this.health = health;
	this.speed = speed;
  }

  public Monster clone() {
    return new Ghost(health, speed);
  }
}
