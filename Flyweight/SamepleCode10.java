void generateTerrain() {
  // Fill the ground with grass.
  for (int x = 0; x < WIDTH; x++) {
    for (int y = 0; y < HEIGHT; y++) {
      // Sprinkle some hills.
      if (random(10) == 0) tiles[x][y] = hillTerrain;
      else tiles[x][y] = grassTerrain;
    }
  }

  // Lay a river.
  int x = random(WIDTH);
  for (int y = 0; y < HEIGHT; y++) {
    tiles[x][y] = riverTerrain;
  }
}
