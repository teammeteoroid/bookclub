class Framebuffer {
  private static final int WIDTH = 160;
  private static final int HEIGHT = 120;

  private char[] pixels = new char[WIDTH * HEIGHT];
  
  public Framebuffer(){
    clear();
  }

  public void clear() {
    for (int i = 0; i < WIDTH * HEIGHT; i++){
      pixels[i] = WHITE;
    }
  }

  public void draw(int x, int y){
    pixels[(WIDTH * y) + x] = BLACK;
  }

  public char getPixels(){
    return pixels;
  }
}
