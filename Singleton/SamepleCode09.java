class Bullet {
  private int x;
  private int y;
  
  public getX() {
    return x;
  }
  
  public getY() {
    return y;
  }
  
  public void setX(int x) {
    this.x = x;
  }
  
  public void setY(int y) {
    this.y = y;
  }
}

class BulletManager {
  public Bullet creat(int x, int y) {
    Bullet bullet = new Bullet();
    bullet.setX(x);
    bullet.setY(y);
    
    return bullet;
  }
  
  public bool isOnScreen(Bullet bullet) {
    return bullet.getX() >= 0 &&
           bullet.getX() < SCREEN_WIDTH &&
           bullet.getY() >= 0 &&
           bullet.getY() < SCREEN_HEIGHT;
  }

  public void move(Bullet bullet) {
    bullet.setX(bullet.getX()+5);
  }
}
