public class Skeleton extends Entity {
  private boolean patrollingLeft;
  
  public Skeleton() {
    patrollingLeft = false;
  }
  
  public voide update() {
    if (patrollingLeft) {
      setX(x() - 1);
      if (x() == 0) patrollingLeft = false;
    } else {
      setX(x() + 1);
      if (x() == 100) patrollingLeft = true;
    }
  }
}
