class Bullet {
  private int x;
  private int y;
  
  public bullet(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public bool isOnScreen() {
    return x >= 0 && x < SCREEN_WIDTH &&
           y >= 0 && y < SCREEN_HEIGHT;
  }

  public void move() {
    x += 5;
  }
}
