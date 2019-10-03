class World {
  private Terrain grassTerrain;
  private Terrain hillTerrain;
  private Terrain riverTerrain;
  
  public World() {
    grassTerrain = Terrain(1, false, GRASS_TEXTURE);
	hillTerrain = Terrain(3, false, HILL_TEXTURE);
	riverTerrain = Terrain(2, true, RIVER_TEXTURE);
  }

  // Other stuff...
}
