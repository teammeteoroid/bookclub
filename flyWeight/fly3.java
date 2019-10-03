package game;

public class fly3 {
	void generateTerrain() {
		for (int x =0; x < WIDTH; x++) {
			for (int y =0; y < HEIGHT; y++) {
				if (Math.random()*10 == 0) {
					tiles_[x][y] = hillTerrian_;
				}
				else {
					tiles_[x][y] = grassTerrain_;
				}
			}
		}
	}
	 int x = random(WIDTH);
	 for (int y = 0; y < HEIGHT; y++) {
		 tiles_[x][y] = riverTerrain_;
	  }
}
