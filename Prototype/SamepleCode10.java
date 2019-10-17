import java.util.function.Supplier;

interface Spawner {
  public Monster spawnMonster();
}

class SpawnerFor<T> implements Spawner {
  private final Supplier<? extends Monster> ctor;
  
  public SpawnerFor(Supplier<? extends Monster> ctor) {
    this.ctor = ctor;
  }
  
  public Monster spawnMonster() {
    return ctor.get();
  }
}
