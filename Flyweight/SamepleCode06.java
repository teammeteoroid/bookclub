int getMovementCost(int x, int y) {
  switch (tiles[x][y]) {
    case TERRAIN_GRASS:
	  return 1;
    case TERRAIN_HILL:
	  return 3;
    case TERRAIN_RIVER:
	  return 2;
      // Other terrains...
  }
}

bool isWater(int x, int y) {
  switch (tiles[x][y]) {
    case TERRAIN_GRASS:
	  return false;
    case TERRAIN_HILL:
	  return false;
    case TERRAIN_RIVER:
	  return true;
      // Other terrains...
  }
}
