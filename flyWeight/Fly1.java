package game;

public class Fly1 {
	
	public class World {
		public int getMovementCost(int x, int y) {
			switch (tiles_[x][y]) {
				case TERRAIN_GRASS:
					return 1;
				case TERRAIN_HILL:
					return 3;
				case TERRAIN_RIVER:
					return 2;
			}
		}
		public boolean isWater(int x, int y) {
			switch (tiles_[x][y]) {
				case TERRAIN_GRASS:
					return false;
				case TERRAIN_HILL:
					return false;
				case TERRAIN_RIVER:
					return true;
			}
		}
	}

}
