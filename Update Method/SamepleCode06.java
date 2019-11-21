abstract class Entity {
  private double x;
  private double y;
  
  public Entity() {
    x = 0;
    y = 0;
  }
  
  public abstract void update();
  
  public double x() {
    return x;
  }
  
  public double y() {
    return y;
  }
  
  public void setX(double x) {
    this.x = x;
  }
  
  public void setY(double y) {
    this.y = y;
  }
}
