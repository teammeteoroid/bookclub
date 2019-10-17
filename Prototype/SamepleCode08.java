import java.util.function.Consumer;

class Spawner {
  private Consumer<Monster> SpawnCallback spawn;
  
  public Spawner(SpawnCallback spawn) {
    this.spawn = spawn;
  }

  public Monster spawnMonster() {
    return spawn.accept();
  }
}
