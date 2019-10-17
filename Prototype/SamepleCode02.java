abstract class Spawner {
  public abstract Monster spawnMonster();
}

public class GhostSpawner extends Spawner {
  public abstract Monster spawnMonster() {
    return new Ghost();
  }
}

public class DemonSpawner extends Spawner {
  public abstract Monster spawnMonster() {
    return new Demon();
  }
}

// You get the idea...
