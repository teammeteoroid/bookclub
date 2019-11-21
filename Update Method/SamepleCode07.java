class World {
  private static final int MAX_ENTITIES;
  
  private Entity[] entities;
  private int numEntities;
  
  public World() {
    numEntities = 0;
    entities = new Entity[MAX_ENTITIES];
  }
  
  public void gameLoop() {
  }
}
