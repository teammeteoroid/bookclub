package game;

public class fly2 {
	class Terrain {
		  private int movementCost;
		  private bool isWater;
		  private Texture texture;
		  
		  public Terrain(int movementCost, bool isWater, Texture texture) {
			  this.movementCost = movementCost;
			  this.isWater = isWater;
			  this.texture = texture;
		  }

		  public int getMovementCost() {
		    return movementCost;
		  }
		  
		  public bool isWater() {
		    return isWater;
		  }
		  
		  public Texture getTexture() {
		    return texture;
		  }
	}
}
