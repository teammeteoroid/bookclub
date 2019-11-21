class World {
  void gameLoop() {
    while (true) {
      // Handle user input...
      
      // Update each entity.
      for (int i = 0; i < numEntities; i++) {
        entities[i].update();
      }

      // Physics and rendering...
    }
  }
}
