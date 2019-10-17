class Spawner {
  private Monster prototype;
  
  public Spawner(Monster prototype) {
    this.prototype = prototype;
  }
  
  public Monster spawnMonster() {
    return prototype.clone();
  }
}
